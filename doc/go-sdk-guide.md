# Go SDK 使用手册



## Getting Started

### Installing

To start using Bolt, install Go and run `go get`:

```sh
$ go get https://github.com/baidu/brcc/brcc-go-sdk
```

This will retrieve the library and install the `brcc-go-sdk` command line utility into
your `$GOBIN` path.


### Importing brcc-go-sdk

```go
import brcc "github.com/baidu/brcc/brcc-go-sdk"
```


### Initial SDK from toml configuraiton
1. prepare brcc configuration 
```toml
serverUrl = "brcc.baidu-int.com"
projectName = "brcc-go-client"
envName = "debug"
versionName = "1.0"
apiPassword = "123456"
enableCallback = true
callbackInterval = 300
requestTimeout = 5
enableCache = true
cacheDir = "/tmp/brcc"
```
save above configuration to local file. eg. "brcc.toml"

2. initialize SDK

```go
// 使用toml配置文件初始化brcc客户端, name为配置文件路径
name := "brcc.toml"
err := brcc.StartWithConfFile(name)
if err != nil {
	panic(fmt.Sprintf("init brcc error: %v", err.Error()))
}
```

### Initial SDK from Conf struct
```go
brccConf := &rcc.Conf{
    ProjectName:         "brcc-go-client",
    EnvName:             "debug",
    ServerUrl:           "brcc.baidu-int.com",
    ApiPassword:         "123456",
    VersionName:         "1.0",
    EnableCallback:      true,
    CallbackIntervalInt: 300,
    RequestTimeoutInt:   5,
    EnableCache:         true,
    CacheDir:            "/tmp/brcc",
}

err := brcc.StartWithConf(ctx, brccConf)
if err != nil {
    panic(fmt.Sprintf("init brcc error: %v", err.Error()))
}
```


#### get configuration items from brcc server. 
```go
// 获取远程配置
brcc.GetValue(key, defaultValue)
// 读取所有的key
brcc.GetAllKeys()
```

#### bind with configuration items for struct type.
```go
type Test struct {
    A bool   `brcc:"test.a"`
    B int    `brcc:"test.b"`
    C string `brcc:"test.c"`
}

tv := &Test{}
// 注入
brcc.Bind(tv)
```




