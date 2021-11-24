# BRCC：Better Remote Config Center

[![Build Status](https://travis-ci.org/baidu/brcc.svg?branch=main)](https://travis-ci.org/github/baidu/brcc)
[![codecov](https://codecov.io/gh/baidu/brcc/branch/main/graph/badge.svg)](https://codecov.io/gh/baidu/brcc)
[![License](https://img.shields.io/badge/Licence-Apache%202.0-blue.svg?style=flat-square)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)

----------------------------------------
[English](./doc/README_en.md) | 简体中文
# 简介
&ensp;&ensp;BRCC是一个分布式配置中心，用于统一管理应用服务的配置信息，避免各类资源散落在各个项目中，简化资源配置的维护成本。作为一种轻量级的解决方案，部署简单，同时支持多环境、多版本、多角色的资源管理，可以在不改变应用源码的情况下无缝切换和实时生效配置信息。

 &ensp;&ensp;BRCC由三部分组成：管理端、服务端、SDK，其中：<br/>
（1）**管理端** : 前后端分离，后端基于Spring Boot 2.0开发，支持6个维度（产品、工程、环境、版本、分组、配置项）管理key-value格式的配置；支持细粒度的权限控制层级、操作轨迹等能力。安全易用，支持插件化的扩展轻松集成任何公司/组织的账号管理系统。<br/>
（2）**服务端**： 基于spring boot 2.0开发，打包后可以直接运行，支持配置的分发、更新推送。<br/>
（3）**SDK**：支持java、go等多种开发语言和开发框架集成，支持spring注解、配置变更监听和刷新，零业务侵入性，低门槛集成（提供spring boot starter方式接入）。<br/>

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

## 技术架构
![技术架构](./doc/img/arch.JPG)

## 快速开始
查看 [快速开始](./doc/quick-start.md)

## 测试环境和账号
地址：http://180.76.36.149/#/login
测试账号1:  test1  123456
测试账号2:  test2  123456

## 全部文档
[部署手册](./doc/deploy-guide.md)

[管理端使用手册](./doc/manage-guide.md)

[Api 文档](./doc/open-api.md)

[JAVA SDK 使用手册](./doc/java-sdk-guide.md)

[Go SDK 使用手册](./doc/go-sdk-guide.md)

## 维护者
- [xiemalin](https://github.com/jhunters)
- [caolei](https://github.com/hubeicaolei)
- [shiminyan](https://github.com/aroundpie)
- [geyoujia](https://github.com/yogazx)
- [zhaofakai](https://github.com/fkzhao)

## 贡献
issues贡献： 如在使用中遇到问题，请在 https://github.com/baidu/brcc/issues 新建 issues 反馈问题。


## 讨论

如果您有任何意见或问题都可以提issue到github或gitee，我们将及时为您解答。

如在使用中遇到问题，快速沟通，可微信扫描二维码，加入brcc技术交流群，添加下列管理员微信，并备注“brcc”，管理员邀您入群：

<img src="./doc/img/contact.jpg" width="200">

您也可以加入百度如流讨论群直接参与讨论和提问：3664772

## 版本更新
- 1.0.0 brcc第一版发布，具备六个维度管理K-V的配置能力、五级权限控制能力、操作轨迹追踪、变更推送、支持spring原生配置注解等功能；

更多内容请参见：[历史发版更新](https://github.com/baidu/brcc/releases)

