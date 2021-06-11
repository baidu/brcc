/*
@Time : 2021-06-11
@Author : xiemalin
*/
package rcc

import "fmt"

// ExampleNewConf the example to show use client to connect server
func ExampleClient() {

	client, err := NewClientWithConfFile(TestConfFile)
	if err != nil {
		return
	}

	err = client.Start()
	if err != nil {
		return
	}
	defer client.Stop()

	keys := client.GetAllKeys()
	for _, v := range keys {
		client.GetValue(v, "DefaultValue")
	}

	s := struct {
		Key string `rcc:"mykey"`
	}{}
	client.Bind(&s)

}

// ExampleClient_Watch he example to show use Watch function
func ExampleClient_Watch() {

	client, err := NewClientWithConfFile(TestConfFile)
	if err != nil {
		return
	}

	err = client.Start()
	if err != nil {
		return
	}
	defer client.Stop()

	// define update callback for Watch function
	callback := func(ce *ChangeEvent) {
		// 建议defer捕获协程panic
		defer func() {
			if r := recover(); r != nil {
				fmt.Println("watch update callback panic")
			}
		}()

		for key, change := range ce.Changes {
			if change.ChangeType == ADD || change.ChangeType == MODIFY {
				fmt.Println("changed item", key, change.NewValue, change.OldValue)
			}
		}
	}
	client.Watch(callback)
}
