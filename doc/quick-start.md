## 快速开始
### 部署brcc
&ensp;&ensp;&ensp;&ensp;请点击《[部署手册](./doc/deploy-guide.md)》查看如何部署brcc server端。假设管理端的地址是http://127.0.0.1:8080
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