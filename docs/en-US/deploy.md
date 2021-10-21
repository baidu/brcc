# Deploy

## 1. Getting Started
BRCC server relies on JDK8, MySQL and Redis.
### 1.1 Java
Install java1.8+.

You can check the jdk version by:

```bazaar
java -version
```

Output example:

```bazaar
java version "1.8.0_261"
Java(TM) SE Runtime Environment (build 1.8.0_261-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.261-b12, mixed mode)
```

### 1.2 Mysql

+ Version 5.6+

### 1.3 Redis

+ Version 3.2+

### 1.4 Compile

1.  Clone the code
2.  Compile(***maven3.3.9+***):
    cd the project root directory: sh compile.sh。
    
## 2. Install

### 2.1 Create Database

+ Create database and user

Example：
```bazaar
source doc/database/schema.sql
```

+ Create database table:
  

Example：
```bazaar
source doc/database/tables.sql
```

+ Insert data:

Example:
```bazaar
source doc/database/data.sql
```

### 2.2 Install Redis

[redis download](https://redis.io/download/)


### 2.3 Compile

```bazaar
1. cd the project root directory
2. command line: sh compile.sh
```

### 2.4 Run

```bazaar
In the project root directory, edit the start.sh, specify the environment parameters respectively:
SERVER_PORT=web server port
REDIS_HOST=Redis server host
REDIS_PORT=Redis server port
DB_HOST=database host
DB_PORT=database port
DB_USERNAME=database user name
DB_PASSWORD=database password

Save and excute:
sh start.sh

```
Console URL:
http://ip:port (ip: server ip, port: server port), example: http://localhost:8080/

