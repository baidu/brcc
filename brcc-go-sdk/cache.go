package rcc

import (
	"encoding/gob"
	"os"
	"sync"
)

// 配置kv内存结构
type Cache struct {
	kv sync.Map
}

func newCache() *Cache {
	return &Cache{
		kv: sync.Map{},
	}
}

func (c *Cache) set(key, val string) {
	c.kv.Store(key, val)
}

func (c *Cache) get(key string) (string, bool) {
	if val, ok := c.kv.Load(key); ok {
		if ret, ok := val.(string); ok {
			return ret, true
		}
	}
	return "", false
}

func (c *Cache) delete(key string) {
	c.kv.Delete(key)
}

func (c *Cache) dump() map[string]string {
	var ret = map[string]string{}
	c.kv.Range(func(key, val interface{}) bool {
		k, _ := key.(string)
		v, _ := val.(string)
		ret[k] = v

		return true
	})
	return ret
}

func (c *Cache) store(name string) error {

	f, err := os.OpenFile(name, os.O_RDWR|os.O_CREATE|os.O_TRUNC, 0755)
	if err != nil {
		return err
	}
	defer f.Close()

	var dumps = map[string]string{}
	dumps = c.dump()
	return gob.NewEncoder(f).Encode(&dumps)
}

func (c *Cache) load(name string) error {

	f, err := os.OpenFile(name, os.O_RDONLY, 0755)
	if err != nil {
		return err
	}
	defer f.Close()

	var dumps = map[string]string{}

	if err := gob.NewDecoder(f).Decode(&dumps); err != nil {
		return err
	}

	for k, v := range dumps {
		c.set(k, v)
	}

	return nil
}
