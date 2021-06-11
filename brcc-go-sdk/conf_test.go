package rcc

import (
	"context"
	"encoding/json"
	"fmt"
	"reflect"
	"testing"
	"time"

	. "github.com/agiledragon/gomonkey/v2"
	"github.com/baidu/brcc/brcc-go-sdk/logutil"
	. "github.com/smartystreets/goconvey/convey"
)

// TestNewConf test conf initialize
func TestNewConf(t *testing.T) {
	// initial log
	logutil.InitLog()
	Convey("Test for conf initailize", t, func() {

		Convey("Test load from config success", func() {
			conf, err := NewConf(TestConfFile)
			So(err, ShouldBeNil)
			So(conf, ShouldNotBeNil)

			So(conf.ProjectName, ShouldEqual, projectName)
			So(conf.EnvName, ShouldEqual, envName)
			So(conf.VersionName, ShouldEqual, versionName)
			So(conf.ApiPassword, ShouldEqual, apiPassword)
			So(conf.ServerUrl, ShouldEqual, serverUrl)
			So(conf.EnableCallback, ShouldEqual, enableCache)
			So(conf.CallbackIntervalInt, ShouldEqual, callbackInterval)
			So(conf.RequestTimeoutInt, ShouldEqual, requestTimeout)
			So(conf.EnableCache, ShouldEqual, enableCache)
			So(conf.RequestTimeout, ShouldEqual, requestTimeout*time.Second)
			So(conf.CallbackInterval, ShouldEqual, callbackInterval*time.Second)
		})

		Convey("test load from non-exist config", func() {
			conf, err := NewConf("fake.toml")
			So(err, ShouldNotBeNil)
			So(conf, ShouldBeNil)
		})

	})
}

// TestNormalize test internal method 'normalize' of Conf
func TestNormalize(t *testing.T) {
	Convey("Test internal method 'normalize' ", t, func() {
		var token string = "akfjsldfjsjdss"

		Convey("test with mock refreshToken and acquireEnvironment", func() {

			// do mock here
			patches := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Post", func(_ *httpRequester, url string, _ interface{}, respData interface{}) error {
				bodyBytes := []byte(fmt.Sprintf(`{"token":"%s"}`, token))
				json.Unmarshal(bodyBytes, respData)

				return nil
			})
			defer patches.Reset()

			// do mock here
			patches2 := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Get", func(_ *httpRequester, url string, respData interface{}) error {
				bodyBytes := []byte(`{"environmentId":1}`)
				json.Unmarshal(bodyBytes, respData)

				return nil
			})
			defer patches2.Reset()

			conf, err := NewConf(TestConfFile)
			So(err, ShouldBeNil)
			err = conf.normalize(context.Background())
			So(err, ShouldBeNil)
		})

	})

}

// TestAcquireEnvironment test internal method 'refreshToken' of Conf
func TestRefreshToken(t *testing.T) {

	Convey("Test internal method 'acquireEnvironment'", t, func() {
		var token string = "sfsdfdsfdsfsdf"
		Convey("test with mock http request", func() {
			// do mock here
			patches := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Post", func(_ *httpRequester, url string, _ interface{}, respData interface{}) error {
				bodyBytes := []byte(fmt.Sprintf(`{"token":"%s"}`, token))
				json.Unmarshal(bodyBytes, respData)

				return nil
			})
			defer patches.Reset()

			conf, err := NewConf(TestConfFile)
			So(err, ShouldBeNil)

			conf.refreshToken(context.Background())
			So(conf.Token, ShouldEqual, token)
		})

	})
}

// TestAcquireEnvironment test internal method 'acquireEnvironment' of Conf
func TestAcquireEnvironment(t *testing.T) {

	Convey("Test internal method 'acquireEnvironment'", t, func() {

		Convey("test with mock http request", func() {
			// do mock here
			patches := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Get", func(_ *httpRequester, url string, respData interface{}) error {
				bodyBytes := []byte(`{"environmentId":1}`)
				json.Unmarshal(bodyBytes, respData)

				return nil
			})
			defer patches.Reset()

			conf, err := NewConf(TestConfFile)
			So(err, ShouldBeNil)

			conf.acquireEnvironment(context.Background())
			So(conf.EnvId, ShouldEqual, 1)
		})

	})
}
