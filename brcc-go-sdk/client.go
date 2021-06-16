package rcc

import (
	"context"
	"fmt"
	"net/http"
	"os"
	"path"

	"github.com/BurntSushi/toml"
	"github.com/baidu/brcc/brcc-go-sdk/logutil"
	"go.uber.org/zap"
)

// Client for rcc
type Client struct {
	conf *Conf

	updateChan chan *ChangeEvent

	cache *Cache

	requester IRequester

	poller IPoller

	ctx    context.Context
	cancel context.CancelFunc

	isRunning chan bool
}

type Item struct {
	Key   string `json:"key"`
	Value string `json:"value"`
}

// NewClientWithConfFile create client from conf file
func NewClientWithConfFile(confFile string) (*Client, error) {
	var conf = &Conf{}

	if _, err := toml.DecodeFile(confFile, conf); err != nil {
		return nil, err
	}
	return NewClient(context.Background(), conf)
}

// NewClientWithConf create client from conf
func NewClientWithConf(conf *Conf) (*Client, error) {
	return NewClient(context.Background(), conf)
}

// NewClient create client from conf
func NewClient(ctx context.Context, conf *Conf) (*Client, error) {
	// initial log
	logutil.InitLog()
	ctx, cancel := context.WithCancel(ctx)

	client := &Client{
		conf:      conf,
		cache:     newCache(),
		requester: newHTTPRequester(ctx, &http.Client{Timeout: conf.RequestTimeout}),
		isRunning: make(chan bool, 1),
	}
	client.ctx, client.cancel = ctx, cancel

	err := conf.normalize(ctx)
	if err != nil {
		return nil, err
	}

	client.poller = newPollerRcc(ctx, conf, client.handleUpdate)
	return client, nil
}

func (c *Client) acquireRunning() bool {
	select {
	case c.isRunning <- true:
		return true
	default:
	}
	return false
}

// Start sync config
func (c *Client) Start() error {

	if !c.acquireRunning() {
		return fmt.Errorf("[rcc-go-client]client has running")
	}

	c.updateChan = nil
	c.ctx, c.cancel = context.WithCancel(context.Background())

	// preload all config to local first
	if err := c.preload(); err != nil {
		return err
	}
	logutil.DefaultLogger().Info("[rcc-go-client]preload success",
		zap.String("projectName", c.conf.ProjectName),
		zap.String("envName", c.conf.EnvName))

	// start fetch update
	if c.conf.EnableCallback {
		logutil.DefaultLogger().Info("[rcc-go-client]enable update callback",
			zap.String("projectName", c.conf.ProjectName),
			zap.String("envName", c.conf.EnvName))
		go c.poller.start()
	}

	return nil
}

// Stop sync config
func (c *Client) Stop() error {
	if c.poller != nil {
		c.poller.stop()
	}
	c.cancel()
	return nil
}

// WatchUpdate get all updates
func (c *Client) WatchUpdate() <-chan *ChangeEvent {
	if c.updateChan == nil {
		c.updateChan = make(chan *ChangeEvent, 32)
	}
	return c.updateChan
}

func (c *Client) doCallback(callback func(ce *ChangeEvent), ce *ChangeEvent) {
	// 捕获callback函数抛出的panic
	defer func() {
		if r := recover(); r != nil {
			logutil.DefaultLogger().Error("[rcc-go-client]watch callback function panic",
				zap.String("projectName", c.conf.ProjectName),
				zap.String("envName", c.conf.EnvName))
		}
	}()
	callback(ce)
}

// Watch
func (c *Client) Watch(callback func(ce *ChangeEvent)) {
	ch := c.WatchUpdate()
	go func(c *Client) {
		for {
			select {
			case ce, ok := <-ch:
				if ok {
					c.doCallback(callback, ce)
				} else {
					logutil.DefaultLogger().Warn("Watch returned chan is closed.")
					return
				}
			}
		}
	}(c)
}

// GetValue
func (c *Client) GetValue(key, defaultValue string) string {
	if c.cache == nil {
		return defaultValue
	}
	if ret, ok := c.cache.get(key); ok && ret != "" {
		return ret
	}
	return defaultValue
}

// GetAllKeys return all config keys in given namespace
func (c *Client) GetAllKeys() []string {
	var keys []string
	if c.cache == nil {
		return nil
	}
	c.cache.kv.Range(func(key, value interface{}) bool {
		str, ok := key.(string)
		if ok {
			keys = append(keys, str)
		}
		return true
	})
	return keys
}

func (c *Client) handleUpdate(versionId int) error {
	change, err := c.sync(versionId)
	if err != nil || change == nil {
		return err
	}

	c.deliveryChangeEvent(change)
	return nil
}

// sync namespace config
func (c *Client) sync(versionId int) (*ChangeEvent, error) {

	url := apiItems(c.conf, versionId)
	result := make([]Item, 0)
	err := c.requester.Get(url, &result)
	if err != nil {
		return nil, err
	}

	return c.processResult(result), nil
}

func (c *Client) processResult(result []Item) *ChangeEvent {
	ret := ChangeEvent{
		Changes: map[string]*Change{},
	}

	resultMap := make(map[string]string)
	for _, item := range result {
		resultMap[item.Key] = item.Value
	}

	kv := c.cache.dump()
	for k, v := range kv {
		if _, ok := resultMap[k]; !ok {
			c.cache.delete(k)
			ret.Changes[k] = makeDeleteChange(k, v)
		}
	}

	for k, v := range resultMap {
		c.cache.set(k, v)
		old, ok := kv[k]
		if !ok {
			ret.Changes[k] = makeAddChange(k, v)
			continue
		}
		if old != v {
			ret.Changes[k] = makeModifyChange(k, old, v)
		}
	}

	// store caches to file
	if c.conf.EnableCache {
		err := c.storeFile(c.getDumpFileName())
		if err != nil {
			logutil.DefaultLogger().Warn(fmt.Sprintf("store cache file(%s) error: %s", c.getDumpFileName(), err))
		}
	}

	return &ret
}

// deliveryChangeEvent push change to subscriber
func (c *Client) deliveryChangeEvent(change *ChangeEvent) {
	if c.updateChan == nil {
		return
	}
	select {
	case <-c.ctx.Done():
		safeCloseChangeEventChan(c.updateChan)
	case c.updateChan <- change:
	}
}

func (c *Client) preload() error {
	if err := c.poller.preload(); err != nil {
		if !c.conf.EnableCache {
			return err
		}
		err1 := c.loadFile(c.getDumpFileName())
		if err1 != nil {
			logutil.DefaultLogger().Warn(fmt.Sprintf("preload from cache file(%s) error: %s", c.getDumpFileName(), err1))
			return err
		}
	} else {
		// store caches to file
		if c.conf.EnableCache {
			err := c.storeFile(c.getDumpFileName())
			if err != nil {
				logutil.DefaultLogger().Warn(fmt.Sprintf("store cache file(%s) error: %s", c.getDumpFileName(), err))
			}
		}
	}

	return nil
}

// loadFile load caches from local file
func (c *Client) loadFile(fileName string) error {
	return c.cache.load(fileName)
}

// storeFile caches to file
func (c *Client) storeFile(fileName string) error {
	if err := c.autoCreateCacheDir(); err != nil {
		return err
	}
	return c.cache.store(fileName)
}

// autoCreateCacheDir autoCreateCacheDir
func (c *Client) autoCreateCacheDir() error {
	fs, err := os.Stat(c.conf.CacheDir)
	if err != nil {
		if os.IsNotExist(err) {
			return os.MkdirAll(c.conf.CacheDir, os.ModePerm)
		}

		return err
	}

	if !fs.IsDir() {
		return fmt.Errorf("conf.CacheDir is not a dir")
	}

	return nil
}

func (c *Client) getDumpFileName() string {
	cacheDir := c.conf.CacheDir
	fileName := fmt.Sprintf(".%s_%s", c.conf.ProjectName, c.conf.EnvName)
	return path.Join(cacheDir, fileName)
}

// Bind
func (c *Client) Bind(s interface{}) error {
	return binding(s, c)
}

// safeCloseChangeEventChan to close channel safty
func safeCloseChangeEventChan(ch chan *ChangeEvent) {
	defer func() {
		if err := recover(); err != nil {
			// close(ch) panic occur
			e, ok := err.(error)
			if ok {
				logutil.DefaultLogger().Warn(e.Error())
			}
		}
	}()

	close(ch) // panic if ch is closed
}
