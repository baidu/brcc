# BRCC：Better Remote Config Center

[![Build Status](https://travis-ci.org/baidu/brcc.svg?branch=main)](https://travis-ci.org/github/baidu/brcc)
[![codecov](https://codecov.io/gh/baidu/brcc/branch/main/graph/badge.svg)](https://codecov.io/gh/baidu/brcc)
[![License](https://img.shields.io/badge/Licence-Apache%202.0-blue.svg?style=flat-square)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)

----------------------------------------
# Introduction
&ensp;&ensp;BRCC is a distributed configuration center for application management services, avoiding scatter resources of all kinds in various projects, reducing the maintenance cost in resource configuration. As a light-weight solution, it is easy to deploy in diversed environment, multiple versions and roles. The configuration can be activated in real time without touching the source code.

 &ensp;&ensp;BRCC is comprised of three parts: management, server, and SDK, specifically: <br/>
（1）**Management** : with a separated frontend and backend, the backend is developed on top of Spring Boot 2.0, supporting 6 dimensions (product, project, environment, version, grouping, configuration item)of managing key-value configuration; it also supports fine-grained of permission control。Easy to use and can be easily integreated in account management system for any companies or groups supporting plug-in extension. <br/>
（2）**Server**： based off of spring boot 2.0。<br/>
（3）**SDK**：supports languages such as java, go, and etc, and spring annotation, monitoring configuration changes and refresh. Zero threat in bussiness and integereation . <br/>

## Features
### 1. Unifiy configuration managements for different environment, and product lines
- provides interface managing configurations from different environments, product lines, and projects <br/>
- through version replication, the configuration of new services can be completed efficiently

### 2. Hot deployment
- Receiving the configuration updates in 2 seconds <br/>
- Initiate notifications of changes

### 3. Authorization management, role sepratation
- Multi-level authority, multi-role fine-grained control (product line, project, environment), support read and write authority<br/>
- Encrypted interactions with important information<br/>
- Token authentication

### 4. Supporting various programming languages
- Support  Java、Go SDK<br/>

### 5. Trackable
- The operation trajectory is traceable<br/>
- Historical configuration can be queried and traced back

### 6. Caching
- Support important interface cache switch configuration<br/>

### 7. Light-weight
- easy to deployment <br/>
- focus on configuration-specific controls

### 8. 查询更方便
- Supports fuzzy matching

## Technical Archietecture
![Archietecture](./doc/img/arch.JPG)

## Quick Start
[quickStart](./doc/quick-start.md)


## Documentation
[deploy_guide](./doc/deploy-guide.md)

[management-gude](./doc/manage-guide.md)

[Api documentation](./doc/open-api.md)

[JAVA SDK guide](./doc/java-sdk-guide.md)

## Contributors
- [shinansheng](https://github.com/sns1988)
- [zengqingyong](https://github.com/ghzengqy568)
- [xiemalin](https://github.com/jhunters)
- [caolei](https://github.com/hubeicaolei)
- [liangchanchan](https://github.com/lena2liang)

## Contribution
issues： Create issues here https://github.com/baidu/brcc/issues as feedback if there's any.


## Discussion

If there's any questions, feel free to create issue in github or gitee.

For contact, below is the QR code for joining brcc's WeChat group, verify yourself with "brcc"：

<img src="./doc/img/contact.jpg" width="200">

or join the discussion forum：3664772

## version updates
more reference to：[update history](https://github.com/baidu/brcc/releases)

