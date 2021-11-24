# BRCC：Better Remote Config Center

[![Build Status](https://travis-ci.org/baidu/brcc.svg?branch=main)](https://travis-ci.org/github/baidu/brcc)
[![codecov](https://codecov.io/gh/baidu/brcc/branch/main/graph/badge.svg)](https://codecov.io/gh/baidu/brcc)
[![License](https://img.shields.io/badge/Licence-Apache%202.0-blue.svg?style=flat-square)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)

----------------------------------------
English | [简体中文](../README.md)
# Description
Better Remote Config Center(BRCC) is a distributed config center, which is used to uniformly manage the configuration information of application services, avoid the spread of  resources in various projects, and simplify the maintenance cost of resources. As a lightweight solution, BRCC is simple to deploy, supports multi-environment, multi-version, multi-role resource management, and can seamlessly switch and take real-time configuration information without changing the source code.
BRCC consists of three parts: console, server and SDK:<br/>
（1）**Console**: Based on Spring Boot 2.0. Support six dimensions of product, project, environment, version, group and configuration. Support Fine-grained access control, operation log and configuration in key-value format. Support multi-environment, multi-version and multi-role. Support plug-in extensions to easily integrate any company/organization account management system.<br/>
（2）**Server**: Based on Spring Boot 2.0. Support configuration distribution and hot update.<br/>
（3）**SDK**: Support JAVA and Go. Support spring annotation, configuration change monitoring and updating. You can use it with spring boot starter.

## Feature
### 1. Management of the configuration in  multiple environments and products
- Manage the configuration of multiple environments, products, and projects on the console<br/>
- Complete the configuration of new application efficiently by copying the version

### 2. Real-time configuration take effect
- Take effect in 2 seconds by default<br/>
- Push safely

### 3. Authority management, role isolation
- Multi-permissions, multi-role<br/>
- Read and write permissions<br/>
- Encrypted interaction
- Token mechanism

### 4. Multi-language support
- Support JAVA and Go
- Support restful API (Http)

### 5. Traceable
- Trace operation log<br/>
- Query historical configuration

### 6. Cacheable
- Support cache configuration<br/>

### 7. Lightweight
- Easy to deploy<br/>
- Focus on the configuration management

### 8. Convenient for query
- key-value configuration
- Support fuzzy search

## User Guide
You can learn how to use BRCC by these guides.

[Quick Start](en-quick-start.md)

[Deploy Guide](en-deploy-guide.md)

[Console Guide](en-manage-guide.md)

[Open API Guide](en-open-api.md)

[Java SDK Guide](en-java-sdk-guide.md)

[Go SDK Guide](en-go-sdk-guide.md)
