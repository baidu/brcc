/*
@Time : 2020-02-20 15:44
@Author : yakkie
*/

package rcc

import (
	"context"
	"fmt"
	"net/http"
	"testing"
	"time"

	"github.com/stretchr/testify/assert"
)

const VersionId = 27
const GroupId = 379
const Token = "bb50de80-4a3e-40c5-b72a-b4fab0aef872"

const TestConfFile = "./testdata/rcc.toml"

type DemoSet struct {
	data map[string]string
}

func (d *DemoSet) Update(ce *ChangeEvent) {

	// 建议defer捕获协程panic
	defer func() {
		if r := recover(); r != nil {
			fmt.Println("watch update callback panic")
		}
	}()

	for key, change := range ce.Changes {
		if change.ChangeType == ADD || change.ChangeType == MODIFY {
			d.data[key] = change.NewValue
		}
	}
}

func TestRcc(t *testing.T) {

	if err := StartWithConfFile(context.Background(), "fake.properties"); err == nil {
		t.Errorf("Start with fake.properties should return err, got :%v", err)
		return
	}

	conf, err := NewConf(TestConfFile)
	if err != nil {
		t.Errorf("new conf fail, got :%v", err)
		return
	}

	// 服务启动前添加配置项
	itemId1, err := addItem(conf, "a1", "111")
	if err != nil {
		t.Errorf("request rcc add item fail, got :%v", err)
		return
	}
	defer func(itemId int) {
		_ = deleteItem(conf, itemId)
	}(itemId1)

	if err := StartWithConfFile(context.Background(), TestConfFile); err != nil {
		t.Errorf("Start with rcc.toml should return nil, got :%v", err)
		return
	}

	if err := defaultClient.loadFile(defaultClient.getDumpFileName()); err != nil {
		t.Errorf("loadLocal should return nil, got: %v", err)
		return
	}

	a1 := GetValue("a1", "222")
	assert.Equal(t, "111", a1)

	// a2 not config in rcc
	a2 := GetValue("a2", "333")
	assert.Equal(t, "333", a2)

	keys := GetAllKeys()
	assert.Contains(t, keys, "a1")

	d := DemoSet{data: map[string]string{}}
	d.data["a1"] = a1
	d.data["a2"] = a2

	// 监听变更
	Watch(d.Update)

	// 客户端运行期间修改/添加rcc配置
	if err := modifyItem(conf, itemId1, "a1", "444"); err != nil {
		t.Errorf("request rcc modify item fail, got :%v ", err)
		return
	}

	itemId2, err := addItem(conf, "a2", "555")
	if err != nil {
		t.Errorf("request rcc add item fail, got :%v", err)
		return
	}
	defer func(itemId int) {
		_ = deleteItem(conf, itemId)
	}(itemId2)

	time.Sleep(time.Second * 1)

	if err := pushVersionService(conf); err != nil {
		t.Errorf("push service should return nil, got :%v", err)
		return
	}

	// 客户端更新有延迟，睡眠一会儿
	time.Sleep(time.Second * 3)

	a1 = GetValue("a1", "333")
	assert.Equal(t, "444", a1)
	a2 = GetValue("a2", "333")
	assert.Equal(t, "555", a2)

	assert.Equal(t, "444", d.data["a1"])
	assert.Equal(t, "555", d.data["a2"])

	// 检验配置替换函数
	content := []byte(`{"a1":"{rcc.a1|999}","a2":"{rcc.a2|999}","z3":"{rcc.z3|999}"}`)
	want := []byte(`{"a1":"444","a2":"555","z3":"999"}`)
	res, err := HelperConfVars(content)
	assert.Equal(t, nil, err)
	assert.Equal(t, want, res)

	if err := Stop(); err != nil {
		t.Errorf("Stop should return nil, got :%v", err)
		return
	}
}

func addItem(conf *Conf, key, val string) (int, error) {
	url := fmt.Sprintf("%s/item/save", httpUrl(conf.ServerUrl))
	data := map[string]interface{}{
		"groupId": GroupId,
		"name":    key,
		"val":     val,
	}

	headers := map[string]string{
		"rcc-token": Token,
	}

	var rspData int
	err := (&httpRequester{
		context.Background(),
		&http.Client{Timeout: conf.RequestTimeout}}).Post2(url, data, headers, &rspData)
	if err != nil {
		return 0, err
	}
	return rspData, nil
}

func modifyItem(conf *Conf, itemId int, key, val string) error {
	url := fmt.Sprintf("%s/item/save", httpUrl(conf.ServerUrl))
	data := map[string]interface{}{
		"id":      itemId,
		"groupId": GroupId,
		//		"name":    key,
		"val": val,
	}

	headers := map[string]string{
		"rcc-token": Token,
	}

	var rspData int
	err := (&httpRequester{
		context.Background(),
		&http.Client{Timeout: conf.RequestTimeout}}).Post2(url, data, headers, &rspData)
	return err
}

func deleteItem(conf *Conf, itemId int) error {
	url := fmt.Sprintf("%s/item/delete/%d", httpUrl(conf.ServerUrl), itemId)

	data := map[string]interface{}{
		"itemId": itemId,
	}

	headers := map[string]string{
		"rcc-token": Token,
	}

	var rspData int
	err := (&httpRequester{
		context.Background(),
		&http.Client{Timeout: conf.RequestTimeout}}).Post2(url, data, headers, &rspData)
	return err

}

func pushVersionService(conf *Conf) error {
	url := fmt.Sprintf("%s/version/pushChange/%d", httpUrl(conf.ServerUrl), VersionId)
	data := map[string]interface{}{
		"id": VersionId,
	}

	headers := map[string]string{
		"rcc-token": Token,
	}

	var rspData int
	err := (&httpRequester{
		context.Background(),
		&http.Client{Timeout: conf.RequestTimeout}}).Post2(url, data, headers, &rspData)
	return err
}
