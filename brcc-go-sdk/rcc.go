/*
@Time : 2020-02-20 15:05
@Author : yakkie
*/

package rcc

import (
	"context"

	"github.com/BurntSushi/toml"
)

var (
	defaultClient *Client
)

// StartWithConfFile run rcc-client with conf file
func StartWithConfFile(ctx context.Context, name string) error {
	var ret = &Conf{}

	if _, err := toml.DecodeFile(name, ret); err != nil {
		return err
	}

	return StartWithConf(ctx, ret)
}

// StartWithConf run rcc-client with Conf
func StartWithConf(ctx context.Context, conf *Conf) error {
	var err error
	defaultClient, err = NewClient(ctx, conf)
	if err != nil {
		return err
	}
	return defaultClient.Start()
}

// Stop sync config
func Stop() error {
	return defaultClient.Stop()
}

// Watch
func Watch(callback func(ce *ChangeEvent)) {
	defaultClient.Watch(callback)
}

// GetValue from default namespace
func GetValue(key, defaultValue string) string {
	return defaultClient.GetValue(key, defaultValue)
}

// Bind
func Bind(s interface{}) error {
	return defaultClient.Bind(s)
}

// GetAllKeys return all config keys in given namespace
func GetAllKeys() []string {
	return defaultClient.GetAllKeys()
}

// 模板变量格式：{env.变量名} 或者 {env.变量名|默认值}
// var osEnvVarReg = regexp.MustCompile(`\{rcc\.([A-Za-z0-9_\.]+)(\|[^}]+)?\}`)

// HelperConfVars 将配置文件中的 {rcc.xxx} 的内容，从rcc变量中读取并替换
//func HelperConfVars(content []byte) ([]byte, error) {
//	contentNew := osEnvVarReg.ReplaceAllFunc(content, func(subStr []byte) []byte {
//		// 将 {rcc.xxx} 中的 xxx 部分取出
//		// 或者 将 {rcc.yyy|val} 中的 yyy|val 部分取出
//
//		keyWithDefaultVal := subStr[len("{rcc.") : len(subStr)-1] // eg: xxx 或者 yyy|val
//		idx := bytes.Index(keyWithDefaultVal, []byte("|"))
//		if idx > 0 {
//			// {env.变量名|默认值} 有默认值的格式
//			key := string(keyWithDefaultVal[:idx])  // eg: yyy
//			defaultVal := keyWithDefaultVal[idx+1:] // eg: val
//			return []byte(GetValue(key, string(defaultVal)))
//		}
//
//		// {env.变量名} 无默认值的部分
//		return []byte(GetValue(string(keyWithDefaultVal), ""))
//	})
//	return contentNew, nil
//}
