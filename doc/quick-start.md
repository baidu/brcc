

* [快速开始](#快速开始)
   * [部署brcc](#部署brcc)
   * [登录管理端增加配置](#登录管理端增加配置)
      * [登录管理端](#登录管理端)
      * [增加产品线](#增加产品线)
      * [增加工程](#增加工程)
      * [增加环境](#增加环境)
      * [增加版本](#增加版本)
      * [增加分组](#增加分组)
      * [增加配置](#增加配置)
   * [使用sdk](#使用sdk)
      * [增加brcc依赖](#增加brcc依赖)
      * [增加brcc的配置](#增加brcc的配置)
      * [检查配置](#检查配置)
      * [使用配置](#使用配置)
      * [使用go-sdk](#使用go-sdk)
## 快速开始
### 部署brcc
&ensp;&ensp;&ensp;&ensp;请点击《[部署手册](./deploy-guide.md)》查看如何部署brcc server端。假设管理端的地址是http://127.0.0.1:8080
### 登录管理端增加配置
#### 登录管理端
访问 http://127.0.0.1:8080/#/login

![登录界面](./img/login.png "登录")

- *\*初始安装的超管账号和密码admin/admin*

#### 增加产品线
&ensp;&ensp;&ensp;&ensp;产品线入口， 产品线入口有3个，首页中的【全部产品线】、具体产品，个人信息菜单下拉框中的【我的产品线】如下图：

![产品线入口](./img/product_entry.png)

新建产品线 test。

![产品线新建](./img/product_create.png)
新建后，点击test进入工程列表
#### 增加工程
&ensp;&ensp;&ensp;&ensp;进入工程列表后，点击"新建工程"按钮。
![工程管理](./img/project-manage.png)
新建工程 example，api密码设置为123456。新建后在工程列表界面点击"example"进入环境页面。
#### 增加环境
点击"新增环境"，增加一个新环境dev,
![环境管理](./img/environment.png)
点击dev，进入版本页面。
#### 增加版本
新增环境 1.0,点击"1.0"进入分组页面。
![版本管理](./img/version-list.png)
#### 增加分组
新增分组 g1，点击"g1"进入配置页面。
![分组管理](./img/group-list.png)
#### 增加配置
增加3个配置：
```
a=5
b=34
c=xx13
```
![配置管理](./img/config-batch.png)
### 使用sdk
#### 增加brcc依赖
创建一个通用的springboot应用，在pom文件中增加如下依赖：
```xml
<dependency>
    <groupId>com.baidu.mapp</groupId>
    <artifactId>brcc-sdk-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
brcc sdk starter的最好使用最新版本。[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)
#### 增加brcc的配置
在application.yml增加brcc的配置
```yaml
rcc:
  cc-server-url: http://127.0.0.1:8080/ #这里brcc server的地址
  project-name: example                 #工程名
  cc-password: 123456                   #工程的api密码
  env-name: dev                         #环境名称
  cc-version-name: 1.0                  #版本名称
  log-properties: true                  #是否打印配置
  enable-update-callback: true          #是否启用自动更新
```
#### 检查配置
启动应用， 在日志中检查是否有打印类似如下信息：
```
a=5
b=34 
c=xx13 
```
#### 使用配置
拉取配置成功后，既可通过spring的placeholder能力在各种注解中使用这些配置，如：
```java
@Value("${a}")
int a = 0;

@Value("${b}")
long b = 0;

@Value("${c}")
String c;
```

#### 使用go-sdk
##### brcc-go-sdk代码库地址
TODO
##### brcc初始化
###### 1) 通过toml文件初始化brcc客户端
配置示例
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
参数说明
| 配置参数         | 类型   | 是否必填 | 配置说明                                                     |
| ---------------- | ------ | -------- | ------------------------------------------------------------ |
| serverUrl        | string | 是       | brcc服务域名                                                 |
| projectName      | string | 是       | brcc工程名                                                   |
| envName          | string | 是       | brcc环境名                                                   |
| versionName      | string | 是       | 版本号                                                       |
| apiPassword      | string | 是       | 工程API密码                                                  |
| enableCallback   | bool   | 否       | 是否开启配置更新回调, 默认值false关闭                        |
| callbackInterval | int    | 否       | 配置更新回调时间间隔, 单位秒, 默认值300秒                    |
| requestTimeout   | int    | 否       | brcc服务接口访问超时时间, 单位秒, 默认值5秒                  |
| enableCache      | bool   | 否       | 是否开启文件缓存, 在远程获取配置失败时从本地缓存中读取配置, 默认值false关闭 |
| cacheDir         | string | 否       | 文件缓存位置, 默认值 /tmp/brcc                               |
初始化
```go
// 使用toml配置文件初始化brcc客户端, name为配置文件路径
err := brcc.StartWithConfFile(name)
if err != nil {
	panic(fmt.Sprintf("init brcc error: %v", err.Error()))
}
```
###### 2) 通过代码配置初始化brcc客户端
初始化示例
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
##### brcc获取远程配置
```go
// 获取远程配置
brcc.GetValue(key, defaultValue)
// 读取所有的key
brcc.GetAllKeys()
```
##### brcc注入
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

