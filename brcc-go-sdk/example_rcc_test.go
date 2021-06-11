/*
@Time : 2021-06-11
@Author : xiemalin
*/

package rcc

import (
	"context"
	"fmt"
)

// DemoSet demo set
type DemoSet struct {
	data map[string]string
}

// Update callback function while regitered in Watch method.
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

// Example_RCC example code to show how to use by default rcc client
func Example_rcc() {

	conf, err := NewConf(TestConfFile)
	if err != nil {
		fmt.Printf("new conf fail, got :%v", err)
		return
	}

	err = StartWithConf(context.Background(), conf)
	if err != nil {
		fmt.Printf("start default cient fail, got :%v", err)
		return
	}

	a1 := GetValue("a1", "222")
	fmt.Println("get value", a1)

	keys := GetAllKeys()
	for _, key := range keys {
		fmt.Println("print out key", key)
	}

	d := DemoSet{data: map[string]string{}}
	d.data["a1"] = "a1"
	d.data["a2"] = "a2"

	// 监听变更
	Watch(d.Update)

	if err := Stop(); err != nil {
		fmt.Printf("Stop should return nil, got :%v", err)
		return
	}
}
