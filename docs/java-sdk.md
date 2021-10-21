# JAVA SDK 使用手册

## 概述

maven 坐标
普通 SDK使用方式[![brcc sdk](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk)
```xml
<dependency>
    <groupId>com.baidu.mapp</groupId>
    <artifactId>brcc-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

spring boot starter使用方式[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)
```xml
<dependency>
    <groupId>com.baidu.mapp</groupId>
    <artifactId>brcc-sdk-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
建议引用最新版本

## 启动参数配置

```yaml
rcc:
  cc-server-url: http://ip:port/
  project-name: example
  cc-password: 123456
  env-name: dev
  cc-version-name: 1.0
  log-properties: true
  enable-update-callback: true
  enable-interrupt-service: true
  enable-gray: false
```
| 配置属性名称 | 默认值 | 必填 | 描述 |
| :-----| :----: | :----: | :---- |
| rcc.cc-server-url | null | 是 | 配置中心服务地址 |
| rcc.project-name | null | 是 | 工程名称 |
| rcc.cc-password | null | 是 | 工程的api密码， 创建工程时指定 |
| rcc.env-name | null | 是 | 请求的环境名称 |
| rcc.cc-version-name | null | 是 | 版本名称 |
| rcc.log-properties | false | 否 | 是否在日志中打印配置 |
| rcc.enable-update-callback | false | 是 | 否启用自动更新 |
| rcc.enable-interrupt-service | true | 是 | 若第一次加载时工程的api密码错误，是否中断服务 |
| rcc.enable-gray | false | 否 | 是否开启灰度功能 |
| rcc.callback-interval | 2000 | 否 | 心跳探测频率（ms） | 
| rcc.connection-timeout | 3000 | 否 | 链接超时时间（ms） |
| rcc.read-timeout | 10000 | 否 | 读超时时间（ms） |
| rcc.app-name | null | 否 | 实例上报，采集应用名称 |
| rcc.container-id-env-name | hostname | 否 | 实例容器ID上报，容器ID对应的环境变量 |
| rcc.idc-env-name | null | 否 | 实例机房信息上报，机房名称对应的环境变量 |
| rcc.use-only-site-local-interfaces | false | 否 | 实例IP上报，是否只允许上报局域网IP |
| rcc.preferred-networks | null | 否 | 上报IP来源网卡(如en0)列表，英文逗号分隔 |
| rcc.ignored-interfaces | null | 否 | 实例IP上报，上报IP来源忽略网卡列表，英文逗号分隔 |

## 自动更新配置

当启动参数中**rcc.enable-update-callback**配置开启的时，自动更新功能打开。
自动更新采用的时观察者模式， 您只需要实现 **com.baidu.brcc.ConfigItemChangedCallable**接口，并将其以Bean的方式注册到Spring容器中，
当系统中有配置方式变更后，并且在管理平台上执行了**推送变更**操作， rcc会主动调用ConfigItemChangedCallable。

例如：
```java
@Configuration
public class ExampleConfiguration {

    @Bean
    public ConfigItemChangedCallable configItemChangedCallable() {
        return new DefaultConfigItemChangedCallable();
    }


}
```
DefaultConfigItemChangedCallable 是rcc提供的默认变更回调实现， 其中仅仅打印变更日志，您可以实现自己的变更业务。
