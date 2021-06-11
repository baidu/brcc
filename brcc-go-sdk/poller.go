package rcc

import (
	"context"
	"errors"
	"fmt"
	"net/http"
	"time"

	"github.com/baidu/brcc/brcc-go-sdk/logutil"
	"go.uber.org/zap"
)

// this is a static check
var _ IPoller = (*pollerRcc)(nil)

// Poller fetch conf updates
type IPoller interface {
	// start poll updates
	start()
	// preload fetch all config to local cache, and update all notifications
	preload() error
	// stop poll updates
	stop()
}

type pollerHandler func(versionId int) error

// PollerRcc
type pollerRcc struct {
	conf *Conf

	handler pollerHandler

	requester IRequester

	ver *versionState

	ctx    context.Context
	cancel context.CancelFunc
}

type versionState struct {
	VersionId int    `json:"versionId"`
	CheckSum  string `json:"checkSum"`
}

func newPollerRcc(ctx context.Context, conf *Conf, handler pollerHandler) IPoller {
	poller := &pollerRcc{
		conf:      conf,
		handler:   handler,
		requester: newHTTPRequester(ctx, &http.Client{Timeout: conf.RequestTimeout}),
		ver:       &versionState{VersionId: 0, CheckSum: ""},
	}
	return poller
}

func (p *pollerRcc) start() {
	p.ctx, p.cancel = context.WithCancel(context.Background())
	go p.watchUpdate()
}

func (p *pollerRcc) preload() error {
	// rcc接口有时候不是特别稳定，加上几次重试
	i := 0
	for {
		err := p.pumpUpdate()
		if err == nil {
			return nil
		} else {
			logutil.DefaultLogger().Error(fmt.Sprintf("[rcc-go-client]remote preload error: %v, retry: %d", err, i),
				zap.String("projectName", p.conf.ProjectName),
				zap.String("envName", p.conf.EnvName))
			if i < 3 {
				time.Sleep(time.Millisecond * 500)
				i++
				continue
			} else {
				return err
			}
		}
	}

}

func (p *pollerRcc) stop() {
	// to check cacel func is not nil
	if p.cancel != nil {
		p.cancel()
	}
}

func (p *pollerRcc) watchUpdate() {
	timer := time.NewTimer(p.conf.CallbackInterval)
	defer timer.Stop()

	for {
		select {
		case <-timer.C:
			err := p.pumpUpdate()
			if err != nil {
				logutil.DefaultLogger().Error(fmt.Sprintf("[rcc-go-client]watch update error: %v", err),
					zap.String("projectName", p.conf.ProjectName),
					zap.String("envName", p.conf.EnvName))
			}
			timer.Reset(p.conf.CallbackInterval)

		case <-p.ctx.Done():
			return
		}
	}
}

func (p *pollerRcc) pumpUpdate() (err error) {

	ver, err := p.poll()
	if err != nil {
		return
	}

	defer func() {
		if r := recover(); r != nil {
			err = errors.New("pump update handler panic")
		}
	}()

	if p.ver.VersionId != ver.VersionId || p.ver.CheckSum != ver.CheckSum {
		if err = p.handler(ver.VersionId); err != nil {
			return
		}
		_ = p.updateVersionState(ver)
	}

	return
}

func (p *pollerRcc) poll() (ver *versionState, err error) {

	ver = &versionState{}
	url := apiVersion(p.conf)
	err = p.requester.Get(url, ver)
	if err != nil {
		return nil, err
	}
	return ver, nil
}

func (p *pollerRcc) updateVersionState(ver *versionState) (oldVer *versionState) {
	oldVer = p.ver
	p.ver = ver
	return oldVer
}
