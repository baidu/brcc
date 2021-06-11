package rcc

import (
	"context"
	"fmt"
	"net/http"
	"os"
	"time"

	"github.com/BurntSushi/toml"
	"github.com/baidu/brcc/brcc-go-sdk/logutil"
)

const (
	DefaultCallbackIntervalInt = 300 // 默认300s触发一次更新拉取
	DefaultRequestTimeoutInt   = 5   // 默认5秒钟接口调用超时时间
	DefaultFilePath            = "/tmp/rcc"
)

// Conf
type Conf struct {
	ProjectName string `toml:"projectName"`
	EnvName     string `toml:"envName"`
	ServerUrl   string `toml:"serverUrl"`
	ApiPassword string `toml:"apiPassword"`
	VersionName string `toml:"versionName"`

	EnableCallback      bool   `toml:"enableCallback"`
	CallbackIntervalInt int64  `toml:"callbackInterval"`
	RequestTimeoutInt   int64  `toml:"requestTimeout"`
	EnableCache         bool   `toml:"enableCache"`
	CacheDir            string `json:"cacheDir,omitempty"`

	Token string
	EnvId int64

	CallbackInterval time.Duration
	RequestTimeout   time.Duration
}

// NewConf create Conf from file
func NewConf(name string) (*Conf, error) {

	// initial log
	logutil.InitLog()

	f, err := os.Open(name)
	if err != nil {
		return nil, err
	}
	defer func() {
		_ = f.Close()
	}()

	var ret Conf
	if _, err := toml.DecodeReader(f, &ret); err != nil {
		return nil, err
	}

	ret.CallbackInterval = time.Duration(ret.CallbackIntervalInt) * time.Second
	ret.RequestTimeout = time.Duration(ret.RequestTimeoutInt) * time.Second

	return &ret, nil
}

func (c *Conf) normalize(ctx context.Context) error {

	if c.ProjectName == "" || c.EnvName == "" || c.ApiPassword == "" || c.ServerUrl == "" || c.VersionName == "" {
		return fmt.Errorf("rcc conf validate error: %v", c)
	}

	if c.CacheDir == "" {
		c.CacheDir = DefaultFilePath
	}

	if c.RequestTimeoutInt == 0 {
		c.RequestTimeoutInt = DefaultRequestTimeoutInt
	}
	c.RequestTimeout = time.Second * time.Duration(c.RequestTimeoutInt)

	if c.EnableCallback {
		if c.CallbackIntervalInt == 0 {
			c.CallbackIntervalInt = DefaultCallbackIntervalInt
		}
		c.CallbackInterval = time.Second * time.Duration(c.CallbackIntervalInt)
	}

	err := c.refreshToken(ctx)
	if err != nil {
		return err
	}

	err = c.acquireEnvironment(ctx)
	if err != nil {
		return err
	}

	return nil
}

func (c *Conf) refreshToken(ctx context.Context) error {
	url := requestTokenUrl(c)
	data := map[string]interface{}{
		"projectName": c.ProjectName,
		"apiPassword": c.ApiPassword,
	}

	rspData := struct {
		Token string `json:"token"`
	}{}

	err := (&httpRequester{ctx, &http.Client{Timeout: c.RequestTimeout}}).Post(url, data, &rspData)
	if err != nil {
		return fmt.Errorf("refresh Token error: %s", err)
	}

	if rspData.Token == "" {
		return fmt.Errorf("refresh Token error: token is empty")
	}

	c.Token = rspData.Token
	return nil
}

func (c *Conf) acquireEnvironment(ctx context.Context) error {
	url := apiEnvironment(c)
	rspData := struct {
		EnvironmentId int64 `json:"environmentId"`
	}{}
	err := (&httpRequester{ctx, &http.Client{Timeout: c.RequestTimeout}}).Get(url, &rspData)
	if err != nil {
		return fmt.Errorf("acquire Environment error: %s", err)
	}

	if rspData.EnvironmentId == 0 {
		return fmt.Errorf("acquire Environment error: environmentId is zero")
	}

	c.EnvId = rspData.EnvironmentId
	return nil
}
