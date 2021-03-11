# BRCC：Better Remote Config Center

[![Build Status](https://travis-ci.org/baidu/brcc.svg?branch=main)](https://travis-ci.org/github/baidu/brcc)
[![codecov](https://codecov.io/gh/baidu/brcc/branch/main/graph/badge.svg)](https://codecov.io/gh/baidu/brcc)
[![License](https://img.shields.io/badge/Licence-Apache%202.0-blue.svg?style=flat-square)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)

----------------------------------------
- [简介](#简介)
- [快速开始](#快速开始)
  - [部署brcc server](#部署brcc)
  - [登录管理端增加配置](#登录管理端增加配置)
    - [登录管理端](#登录管理端)
    - [增加产品线](#增加产品线)
    - [增加工程](#增加工程)
    - [增加环境](#增加环境)
    - [增加版本](#增加版本)
    - [增加分组](#增加分组)
    - [增加配置](#增加配置)
  - [使用java sdk](#使用sdk)
    - [创建java应用](#创建java应用)
    - [增加brcc依赖](#增加brcc依赖)  
    - [增加brcc的配置](#增加brcc的配置)
    - [检查配置](#检查配置)
- [全部文档](#全部文档)
- [技术架构](#技术架构)
- [特性](#特性)
- [维护者](#维护者)
- [贡献](#贡献)
- [讨论](#讨论)
- [版本更新](#版本更新)
# 简介
&ensp;&ensp;BRCC是一个分布式配置中心，用于统一管理应用服务的配置信息，避免各类资源散落在各个项目中，简化资源配置的维护成本。作为一种轻量级的解决方案，部署简单，同时支持多环境、多版本、多角色的资源管理，可以在不改变应用源码的情况下无缝切换和实时生效配置信息。

 &ensp;&ensp;BRCC由三部分组成：管理端、服务端、SDK，其中：<br/>
（1）**管理端** : 前后端分离，后端基于Spring Boot 2.0开发，支持6个维度（产品、工程、环境、版本、分组、配置项）管理key-value格式的配置；支持细粒度的权限控制层级、操作轨迹等能力。安全易用，支持插件化的扩展轻松集成任何公司/组织的账号管理系统。<br/>
（2）**服务端**： 基于spring boot 2.0开发，打包后可以直接运行，支持配置的分发、更新推送。<br/>
（3）**SDK**：支持java、go等多种开发语言和开发框架集成，支持spring注解、配置变更监听和刷新，零业务侵入性，低门槛集成（提供spring boot starter方式接入）。<br/>


## 快速开始
### 部署brcc
&ensp;&ensp;&ensp;&ensp;请点击《[部署手册](./doc/deploy-guide.md)》查看如何部署brcc server端。假设管理端的地址是http://127.0.0.1:8080
### 登录管理端增加配置
#### 登录管理端
访问 http://127.0.0.1:8080/#/login

![登录界面](./doc/img/login.png "登录")

- *\*初始安装的超管账号和密码admin/admin*

#### 增加产品线
&ensp;&ensp;&ensp;&ensp;产品线入口， 产品线入口有3个，首页中的【全部产品线】、具体产品，个人信息菜单下拉框中的【我的产品线】如下图：

![产品线入口](./doc/img/product_entry.png)

新建产品线 test。

![产品线新建](./doc/img/product_create.png)
新建后，点击test进入工程列表
#### 增加工程
&ensp;&ensp;&ensp;&ensp;进入工程列表后，点击"新建工程"按钮。
![工程管理](./doc/img/project-manage.png)
新建工程 example，api密码设置为123456。新建后在工程列表界面点击"example"进入环境页面。
#### 增加环境
点击"新增环境"，增加一个新环境dev,
![环境管理](./doc/img/environment.png)
点击dev，进入版本页面。
#### 增加版本
新增环境 1.0,点击"1.0"进入分组页面。
![版本管理](./doc/img/version-list.png)
#### 增加分组
新增分组 g1，点击"g1"进入配置页面。
![分组管理](./doc/img/group-list.png)
#### 增加配置
增加3个配置：
```
a=5
b=34
c=xx13
```
![配置管理](./doc/img/config-batch.png)
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
## 全部文档
[部署手册](./doc/deploy-guide.md)

[管理端使用手册](./doc/manage-guide.md)

[Api 文档](./doc/open-api.md)

[JAVA SDK 使用手册](./doc/java-sdk-guide.md)


## 技术架构
![技术架构](./doc/img/arch.JPG)


## 特性
### 1. 统一管理不同环境、不同产品线的配置
- 提供统一界面集中式管理不同环境、不同产品线、不同工程的配置<br/>
- 通过版本的复制，可以高效的完成新业务的配置

### 2. 配置修改实时生效（热发布）
- 默认2秒接收到最新的配置<br/>
- 主动变更通知

### 3. 权限管理、角色隔离
- 多级权限、多种角色细粒度管控（产品线、工程、环境），支持读写权限<br/>
- 重要信息加密交互<br/>
- Token机制
### 4. 多语言支持
- 支持Java、Go客户端以SDK方式接入<br/>
- 支持OpenAPI快速接入（不限定语言，只要支持Http协议即可）

### 5. 可追溯
- 操作轨迹可追踪<br/>
- 历史配置可查询和回溯

### 6. 缓存加持
- 重要接口支持缓存开关配置<br/>

### 7. 更轻量
- 部署简单，目前强依赖的外部服务是MySQL<br/>
- 更聚焦：只关注配置相关的控制

### 8. 查询更方便
- 细粒度化到key-value配置项层级<br/>
- 支持模糊匹配检索


## 维护者
- [shinansheng](https://github.com/sns1988)
- [zengqingyong](https://github.com/ghzengqy568)
- [xiemalin](https://github.com/jhunters)
- [caolei](https://github.com/hubeicaolei)
- [liangchanchan](https://github.com/lena2liang)

## 贡献
issues贡献： 如在使用中遇到问题，请在 https://github.com/baidu/brcc/issues 新建 issues 反馈问题。


## 讨论

如果您有任何意见或问题都可以提issue到github或gitee，我们将及时为您解答。

如在使用中遇到问题，快速沟通，可微信扫描二维码，加入brcc技术交流群，添加下列管理员微信，并备注“brcc”，管理员邀您入群：

<img src="./doc/img/contact.jpg" width="200">

您也可以加入百度如流讨论群直接参与讨论和提问：3664772

## 版本更新
- 1.0.0 brcc第一版发布，具备六个维度管理K-V的配置能力、五级权限控制能力、操作轨迹追踪、变更推送、支持spring原生配置注解等功能；


