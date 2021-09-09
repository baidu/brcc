# 一、准备工作
配置中心服务端依赖jdk、mysql数据库和Redis。
## 1.1 Java
由于配置中心服务端采用了大量java8的新特性， 所以需要在本地安装java1.8+。

可以通过以下命令查看安装的jdk版本

```bazaar
java -version
```

样例输出：

```bazaar
java version "1.8.0_261"
Java(TM) SE Runtime Environment (build 1.8.0_261-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.261-b12, mixed mode)
```

## 1.2 Mysql

+ 版本要求 5.6+

## 1.3 Redis

+ 版本要求 3.2+

## 1.4 编译服务端运行包

1.  下载代码库
2.  编译（***依赖maven3.3.9+***）执行如下命令:
    cd 到项目的根目录后执行 sh compile.sh。
    
# 二、 安装步骤

## 2.1 创建数据库

+ 创建数据库及用户

下面以MySQL原生客户端为例：
```bazaar
source doc/database/schema.sql
```

+ 创建数据库表
  

下面以MySQL原生客户端为例：
```bazaar
source doc/database/tables.sql
```

+ 插入初始化数据
```bazaar
source doc/database/data.sql
```

## 2.2 安装redis

[redis下载](https://redis.io/download/)


## 2.3 编译

```bazaar
1. cd到项目根目录
2. 执行：sh compile.sh

注意： 观察编译有无报错
```

## 2.4 运行

```bazaar
在项目根目录下，编辑start.sh执行脚本，分别指定好环境参数
SERVER_PORT=web服务监听端口
REDIS_HOST=Redis服务地址
REDIS_PORT=Redis服务端口
DB_HOST=数据库地址
DB_PORT=数据库端口
DB_USERNAME=数据库用户名
DB_PASSWORD=数据库密码

保存后执行：
sh start.sh

```
管理端访问入口
http://ip:port 其中IP为服务启动的IP，Port为web服务监听端口，例如 http://localhost:8080/

# 三、 容器化部署
- [制作Docker镜像](./docker-guide.md)

- [Kubernetes](./k8s-guide.md)