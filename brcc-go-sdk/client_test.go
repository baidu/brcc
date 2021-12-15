/*
@Time : 2021-06-11
@Author : xiemalin
*/
// mock request from rcc server for pure sdk test
package rcc

import (
	"context"
	"encoding/json"
	"fmt"
	"reflect"
	"strings"
	"testing"
	"time"

	. "github.com/agiledragon/gomonkey/v2"
	. "github.com/smartystreets/goconvey/convey"
)

// TestNewClient test all api of create client
func TestNewClient(t *testing.T) {

	Convey("test all api of create client", t, func() {
		// do mock here
		patches := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Post", func(_ *httpRequester, url string, _ interface{}, respData interface{}) error {
			bodyBytes := []byte(fmt.Sprintf(`{"token":"%s"}`, Token))
			json.Unmarshal(bodyBytes, respData)

			return nil
		})
		defer patches.Reset()

		// do mock here
		patches2 := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Get", func(_ *httpRequester, url string, respData interface{}) error {
			// mock env value
			if strings.Contains(url, EnvAPI) {
				bodyBytes := []byte(fmt.Sprintf(`{"environmentId":%d}`, EnvironmentId))
				json.Unmarshal(bodyBytes, respData)
				return nil
			}

			return nil
		})
		defer patches2.Reset()

		Convey("test NewClientWithConfFile", func() {

			client, err := NewClientWithConfFile(TestConfFile)
			So(err, ShouldBeNil)
			So(client, ShouldNotBeNil)
		})

		Convey("test NewClientWithConf", func() {
			conf, err := NewConf(TestConfFile)
			So(err, ShouldBeNil)
			So(conf, ShouldNotBeNil)

			client, err := NewClientWithConf(conf)
			So(err, ShouldBeNil)
			So(client, ShouldNotBeNil)
		})

		Convey("test NewClient", func() {
			conf, err := NewConf(TestConfFile)
			So(err, ShouldBeNil)
			So(conf, ShouldNotBeNil)

			client, err := NewClient(context.Background(), conf)
			So(err, ShouldBeNil)
			So(client, ShouldNotBeNil)
		})
	})

}

// TestClientGet test client get action with mock way
func TestClientGet(t *testing.T) {

	changeableCheckSum := CheckSum
	changeableItemJson := OneItem

	Convey("test client get", t, func() {
		// do mock here
		patches := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Post", func(_ *httpRequester, url string, _ interface{}, respData interface{}) error {
			bodyBytes := []byte(fmt.Sprintf(`{"token":"%s"}`, Token))
			json.Unmarshal(bodyBytes, respData)

			return nil
		})
		defer patches.Reset()

		// do mock here
		patches2 := ApplyMethod(reflect.TypeOf((*httpRequester)(nil)), "Get", func(_ *httpRequester, url string, respData interface{}) error {
			// mock env value
			if strings.Contains(url, EnvAPI) {
				bodyBytes := []byte(fmt.Sprintf(`{"environmentId":%d}`, EnvironmentId))
				json.Unmarshal(bodyBytes, respData)
				return nil
			}

			// mock version value
			if strings.Contains(url, VerionAPI) {
				bodyBytes := []byte(fmt.Sprintf(`{"versionId":%d, "checkSum":"%s"}`, VersionId, changeableCheckSum))
				json.Unmarshal(bodyBytes, respData)
				return nil
			}

			// mock item value
			if strings.Contains(url, ItemAPI) {
				bodyBytes := []byte(changeableItemJson)
				json.Unmarshal(bodyBytes, respData)
				return nil
			}

			return nil
		})
		defer patches2.Reset()

		err := StartWithConfFile(context.Background(), TestConfFile)
		So(err, ShouldBeNil)
		defer Stop()

		Convey("test client GetAllKeys", func() {

			keys := GetAllKeys()
			So(len(keys), ShouldEqual, 1)
			So(keys[0], ShouldEqual, C_Key1)
		})

		Convey("test client GetValue", func() {
			defaultValue := "default_value"
			// exist key
			key := GetValue(C_Key1, defaultValue)
			So(key, ShouldEqual, C_Value1)

			// fake key
			key = GetValue("fake_key_from_matthew", defaultValue)
			So(key, ShouldEqual, defaultValue)

		})

		Convey("test client bind", func() {
			s := struct {
				Key string `rcc:"mykey"`
			}{}
			Bind(&s)

			So(s.Key, ShouldEqual, C_Value1)
		})

		Convey("test Watch function", func() {
			newvalue := "matthew"
			// define update callback for Watch function
			callback := func(ce *ChangeEvent) {
				// 建议defer捕获协程panic
				defer func() {
					if r := recover(); r != nil {
						fmt.Println("watch update callback panic")
					}
				}()

				for key, change := range ce.Changes {
					if change.ChangeType == MODIFY {
						So(key, ShouldEqual, C_Key1)
						So(change.ChangeType, ShouldEqual, change.ChangeType == MODIFY)
						So(change.NewValue, ShouldEqual, newvalue)
					}
				}
			}
			Watch(callback)

			// update check sum
			changeableCheckSum = "thisnewchecksum"
			changeableItemJson = `[{"key":"mykey", "value":"matthew"}]`

			// wait seconds for update loop arrived
			time.Sleep(3 * time.Second)
		})
	})
}
