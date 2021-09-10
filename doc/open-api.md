- [open api 对外接口文档](#open-api-对外接口文档)
  - [1. 获取工程 api token](#1-获取工程-api-token)
    - [描述](#描述)
    - [请求类型](#请求类型)
    - [请求URL](#请求url)
    - [请求参数（json body）](#请求参数json-body)
    - [请求示例](#请求示例)
    - [返回参数](#返回参数)
    - [返回样例](#返回样例)
  - [2. 获取工程下的所有环境](#2-获取工程下的所有环境)
    - [描述](#描述-1)
    - [请求类型](#请求类型-1)
    - [请求URL](#请求url-1)
    - [请求参数（query string）](#请求参数query-string)
    - [请求示例](#请求示例-1)
    - [返回参数](#返回参数-1)
    - [返回样例](#返回样例-1)
  - [3. 根据环境名称获取指定环境](#3-根据环境名称获取指定环境)
    - [描述](#描述-2)
    - [请求类型](#请求类型-2)
    - [请求URL](#请求url-2)
    - [请求参数（query string）](#请求参数query-string-1)
    - [请求示例](#请求示例-2)
    - [返回参数](#返回参数-2)
    - [返回样例](#返回样例-2)
  - [4. 获取环境下所有版本](#4-获取环境下所有版本)
    - [描述](#描述-3)
    - [请求类型](#请求类型-3)
    - [请求URL](#请求url-3)
    - [请求参数（query string）](#请求参数query-string-2)
    - [请求示例](#请求示例-3)
    - [返回参数](#返回参数-3)
    - [返回样例](#返回样例-3)
  - [5. 根据版本名称获取指定版本](#5-根据版本名称获取指定版本)
    - [描述](#描述-4)
    - [请求类型](#请求类型-4)
    - [请求URL](#请求url-4)
    - [请求参数（query string）](#请求参数query-string-3)
    - [请求示例](#请求示例-4)
    - [返回参数](#返回参数-4)
    - [返回样例](#返回样例-4)
  - [6. 根据版本名称获取指定版本(支持灰度)](#6-根据版本名称获取指定版本支持灰度)
    - [描述](#描述-5)
    - [请求类型](#请求类型-5)
    - [请求URL](#请求url-5)
    - [请求参数（query string）](#请求参数query-string-4)
    - [请求示例](#请求示例-5)
    - [返回参数](#返回参数-5)
    - [返回样例](#返回样例-5)
  - [7. 获取版本下所有分组](#7-获取版本下所有分组)
    - [描述](#描述-6)
    - [请求类型](#请求类型-6)
    - [请求URL](#请求url-6)
    - [请求参数（query string）](#请求参数query-string-5)
    - [请求示例](#请求示例-6)
    - [返回参数](#返回参数-6)
    - [返回样例](#返回样例-6)
  - [8. 获取所有配置项](#8-获取所有配置项)
    - [描述](#描述-7)
    - [请求类型](#请求类型-7)
    - [请求URL](#请求url-7)
    - [请求参数（query string）](#请求参数query-string-6)
    - [请求示例](#请求示例-7)
    - [返回参数](#返回参数-7)
    - [返回样例](#返回样例-7)
  - [9. 根据分组获取分组下配置项](#9-根据分组获取分组下配置项)
    - [描述](#描述-8)
    - [请求类型](#请求类型-8)
    - [请求URL](#请求url-8)
    - [请求参数（query string）](#请求参数query-string-7)
    - [请求示例](#请求示例-8)
    - [返回参数](#返回参数-8)
    - [返回样例](#返回样例-8)
  - [10. 根据配置名称获取指定配置项](#10-根据配置名称获取指定配置项)
    - [描述](#描述-9)
    - [请求类型](#请求类型-9)
    - [请求URL](#请求url-9)
    - [请求参数（query string）](#请求参数query-string-8)
    - [请求示例](#请求示例-9)
    - [返回参数](#返回参数-9)
    - [返回样例](#返回样例-9)
  - [11. 批量获取指定配置项](#11-批量获取指定配置项)
    - [描述](#描述-10)
    - [请求类型](#请求类型-10)
    - [请求URL](#请求url-10)
    - [请求参数（query string）](#请求参数query-string-9)
    - [请求示例](#请求示例-10)
    - [返回参数](#返回参数-10)
    - [返回样例](#返回样例-10)
  - [12. 新增环境](#12-新增环境)
    - [描述](#描述-11)
    - [请求类型](#请求类型-11)
    - [请求URL](#请求url-11)
    - [请求参数（query string）](#请求参数query-string-10)
    - [请求示例](#请求示例-11)
    - [返回参数](#返回参数-11)
    - [返回样例](#返回样例-11)
  - [13. 新增版本](#13-新增版本)
    - [描述](#描述-12)
    - [请求类型](#请求类型-12)
    - [请求URL](#请求url-12)
    - [请求参数（query string）](#请求参数query-string-11)
    - [请求示例](#请求示例-12)
    - [返回参数](#返回参数-12)
    - [返回样例](#返回样例-12)
  - [14. 新增分组](#14-新增分组)
    - [描述](#描述-13)
    - [请求类型](#请求类型-13)
    - [请求URL](#请求url-13)
    - [请求参数（query string）](#请求参数query-string-12)
    - [请求示例](#请求示例-13)
    - [返回参数](#返回参数-13)
    - [返回样例](#返回样例-13)
  - [15. 新增配置项](#15-新增配置项)
    - [描述](#描述-14)
    - [请求类型](#请求类型-14)
    - [请求URL](#请求url-14)
    - [请求参数（query string）](#请求参数query-string-13)
    - [请求示例](#请求示例-14)
    - [返回参数](#返回参数-14)
    - [返回样例](#返回样例-14)
  - [16. 修改配置项](#16-修改配置项)
    - [描述](#描述-15)
    - [请求类型](#请求类型-15)
    - [请求URL](#请求url-15)
    - [请求参数（query string）](#请求参数query-string-14)
    - [请求示例](#请求示例-15)
    - [返回参数](#返回参数-15)
    - [返回样例](#返回样例-15)
  - [17. 删除配置项](#17-删除配置项)
    - [描述](#描述-16)
    - [请求类型](#请求类型-16)
    - [请求URL](#请求url-16)
    - [请求参数（query string）](#请求参数query-string-15)
    - [请求示例](#请求示例-16)
    - [返回参数](#返回参数-16)
    - [返回样例](#返回样例-16)
  - [18. 批量修改配置项](#18-批量修改配置项)
    - [描述](#描述-17)
    - [请求类型](#请求类型-17)
    - [请求URL](#请求url-17)
    - [请求参数（query string）](#请求参数query-string-16)
    - [请求示例](#请求示例-17)
    - [返回参数](#返回参数-17)
    - [返回样例](#返回样例-17)
  - [19. 推送变更](#19-推送变更)
    - [描述](#描述-18)
    - [请求类型](#请求类型-18)
    - [请求URL](#请求url-18)
    - [请求参数（query string）](#请求参数query-string-17)
    - [请求示例](#请求示例-18)
    - [返回参数](#返回参数-18)
    - [返回样例](#返回样例-18)
  
# open api 对外接口文档

## 1. 获取工程 api token

### 描述

获取open api 访问的token

### 请求类型

POST

### 请求URL

/api/auth

### 请求参数（json body）


参数名称 | 类型 | 方式 | 必填 | 说明 
---|---|---|---|---
projectName| String | body | Y | 工程名称
apiPassword| String | body | Y | 工程api密码

### 请求示例

```json
{
    "projectName": "yourProjectName",
    "apiPassword": "yourProjectPassword"
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId| Long | 工程ID
projectName| String | 工程名称
token| String | 访问工程的 api token
neverExpired | Boolean | 是否永不过期，true: 永不过期，false: 根据expiredTime判断是否过期
expiredTime| Long | 过期时间，时间戳形式，单位为毫秒

### 返回样例

```json
{
    "status":0,
    "msg":"success",
    "data":{
        "projectId":6,
        "projectName":"your-project-name",
        "token":"04ecc5c89105461a90b946f8fe1f0948",
        "neverExpired":true,
        "expiredTime":0
    }
}
```

## 2. 获取工程下的所有环境

### 描述

获取工程下的所有环境

### 请求类型

GET

### 请求URL

/api/environment

### 请求参数（query string）


参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | 工程的	api token

### 请求示例

```shell

curl --request GET -sL \
     --url 'http://ip:port/api/environment?token=03ecc4c89105461a90b926f8fe1f0948'

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId| Long | 工程ID
environmentId| Long | 环境ID
environmentName| String | 环境名称

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":[
    {
      "projectId":6,
      "environmentId":54,
      "environmentName":"dev"
    },
    {
      "projectId":6,
      "environmentId":55,
      "environmentName":"test"
    },
    {
      "projectId":6,
      "environmentId":56,
      "environmentName":"online"
    }
  ]
}
```

## 3. 根据环境名称获取指定环境

### 描述

根据环境名称获取指定环境

### 请求类型

GET

### 请求URL

/api/environment/{environmentName}

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | 工程的	api token
environmentName | String | path | Y | 环境名称

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/environment/dev?token=03ecc4c89105461a90b926f8fe1f0948'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | Long | 工程ID
environmentId | Long | 环境ID
environmentName | String | 环境名称

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":{
    "projectId":6,
    "environmentId":56,
    "environmentName":"online"
  }
}
```

## 4. 获取环境下所有版本

### 描述

获取环境下所有版本

### 请求类型

GET

### 请求URL

/api/version

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | query | Y | 环境ID

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/version?token=03ecc61a90b926f8fe1f0948&environmentId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | Long | 工程ID
environmentId | Long | 环境ID
versionId | Long | 版本ID
versionName | String | 版本名称
checkSum | String | 版本checkSum

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":[
    {
      "projectId":6,
      "environmentId":58,
      "versionId":63,
      "versionName":"1.0.0.0",
      "checkSum":""
    }
  ]
}
```

## 5. 根据版本名称获取指定版本

### 描述

根据版本名称获取指定版本

### 请求类型

GET

### 请求URL

/api/version/{versionName}

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | query | Y | 环境ID
versionName | String | path | Y | 版本名称


### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/version/1.0.0?token=03eccb926f8fe1f0948&environmentId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | Long | 工程ID
environmentId | Long | 环境ID
versionId | Long | 版本ID
versionName | String | 版本名称
checkSum | String | 版本checkSum

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":{
    "projectId":6,
    "environmentId":58,
    "versionId":63,
    "versionName":"1.0.0.0",
    "checkSum":""
  }
}
```

## 6. 根据版本名称获取指定版本(支持灰度)

### 描述

根据版本名称获取指定版本或灰度版本

### 请求类型

GET

### 请求URL

/api/v2/version/{versionName}

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | query | Y | 环境ID
containerId | String | query | N | 容器ID
idc | String | query | N | 机房名称
ip | String | query | N | ip
versionName | String | path | Y | 主版本名称

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/v2/version/1.0.0?token=5461a26f8fe1f0948&environmentId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | Long | 工程ID
environmentId | Long | 环境ID
versionId | Long | 版本ID
versionName | String | 版本名称
checkSum | String | 版本checkSum

### 返回样例

```json
{
  "status": 0,
    "msg": "success",
    "data": {
        "projectId": 16,
        "environmentId": 49,
        "versionId": 94,
        "versionName": "灰度版本0",
        "checkSum": ""
    },
    "sts": 1628738798909
}
```

## 7. 获取版本下所有分组

### 描述

获取版本下所有分组

### 请求类型

GET

### 请求URL

/api/group

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | 版本ID

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/group/1.0.0?token=03ecc4c891090b926f8fe1f0948&versionId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
groupId | Long | 分组ID
groupName | String | 分组名称

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":[
    {
      "groupId":506,
      "groupName":"g1"
    },
    {
      "groupId":507,
      "groupName":"g2"
    }
  ]
}
```

## 8. 获取所有配置项

### 描述

获取所有配置项

### 请求类型

GET

### 请求URL

/api/item

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | 版本ID

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/item?token=03ecc4c8910b926f8fe1f0948&versionId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | String | 配置项名称
value | String | 配置值

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":[
    {
      "key":"amis.bns",
      "value":"group.legend-frontend.orp.all"
    },
    {
      "key":"amis.enable",
      "value":"false"
    },
    {
      "key":"amis.env",
      "value":"test"
    },
    {
      "key":"bdrp.nodes",
      "value":"10.206.201.47:8404"
    },
    {
      "key":"bigpipe.auditPass.cluster",
      "value":"bigpipe_sandbox_new"
    }
  ]
}
```

## 9. 根据分组获取分组下配置项

### 描述

根据分组获取分组下配置项

### 请求类型

GET

### 请求URL

/api/groupItem

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
groupId | Long | query | Y | 分组ID

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/groupItem?token=03ecc4c89106f8fe1f0948&groupId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | String | 配置项名称
value | String | 配置值

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data": {
    "key":"amis.env",
    "value":"test"
  }
}
```

## 10. 根据配置名称获取指定配置项

### 描述

根据配置名称获取指定配置项

### 请求类型

GET

### 请求URL

/api/item/{itemName}

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | 版本ID
itemName | String | path | Y | 配置名称

### 请求示例

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/item/MySQL?token=03ecc4c8926f8fe1f0948&versionId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | String | 配置项名称
value | String | 配置值

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data": {
    "key":"amis.env",
    "value":"test"
  }
}
```


## 11. 批量获取指定配置项

### 描述

批量获取指定配置项

### 请求类型

POST

### 请求URL

/api/item/batchItem

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | 版本ID
keys | List\<String\> | body | N | 如果为空则获取版本下的所有配置项

### 请求示例

```json
{
    "versionId":3,
    "keys":[
        "k1",
        "k2"
    ]
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | String | 配置项名称
value | String | 配置值

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":[
    {
      "key":"spring.datasource.hikari.max-lifetime",
      "value":"1800000"
    },
    {
      "key":"spring.datasource.name",
      "value":"mdc-datasource"
    }
  ]
}
```

## 12. 新增环境

### 描述

新增环境

### 请求类型

POST

### 请求URL

/api/environmentAdd

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
name | String | body | Y | 环境名称
memo | String | body | N | 环境简介

### 请求示例

```json
{
  "name":"dev",
  "memo":"开发"  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
id | Long | 环境ID

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 13. 新增版本

### 描述

新增版本

### 请求类型

POST

### 请求URL

/api/versionAdd

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | body | Y | 环境ID
name | String | body | Y | 版本名称
memo | String | body | N | 版本简介

### 请求示例

```json
{
  "environmentId":50,
  "name":"1.0",
  "memo":"1.0版本"  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
id | Long | 版本ID

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 14. 新增分组

### 描述

新增分组

### 请求类型

POST

### 请求URL

/api/groupAdd

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | 版本ID
name | String | body | Y | 分组名称
memo | String | body | N | 分组简介

### 请求示例

```json
{
  "versionId":63,
  "name":"g1",
  "memo":"简介"  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
id | Long | 分组ID

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 15. 新增配置项

### 描述

新增配置项

### 请求类型

POST

### 请求URL

/api/itemAdd

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | 版本ID
groupId | Long | body | Y | 分组ID
key | String | body | Y | 配置项名称
value | String | body | Y | 配置项值
memo | String | body | N | 配置项简介

### 请求示例

```json
{
  "versionId":63,
  "groupId":12,
  "key":"a",
  "value":"ssss",
  "memo":"简介"  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
id | Long | 配置项ID

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 16. 修改配置项

### 描述

修改配置项

### 请求类型

POST

### 请求URL

/api/itemEdit

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | 版本ID
key | String | body | Y | 配置项名称
value | String | body | N | 配置项值
memo | String | body | N | 配置项简介

### 请求示例

```json
{
  "versionId":63,
  "key":"a",
  "value":"ssss",
  "memo":"简介"  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
cnt | Long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":2
}
```

## 17. 删除配置项

### 描述

删除配置项

### 请求类型

POST

### 请求URL

/api/itemDelete

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | 版本ID
key | String | body | Y | 配置项名称

### 请求示例

```json
{
  "versionId":63,
  "key":"a"
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
cnt | Long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 18. 批量修改配置项

### 描述

批量修改配置项

### 请求类型

POST

### 请求URL

/api/batchSave

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---

token | String | query | Y | api token
versionId | Long | body | Y | 版本ID
groupId | Long | body | Y | 分组ID
items | List\<Object\> | body | N | 配置项列表
items[i].name | String | body | Y | 配置项名称
items[i].memo | String | body | N | 配置项简介
items[i].val | String | body | N | 配置项值

### 请求示例

```json
{
  "versionId":3,
  "groupId":60,
  "items":[
    {
      "name":"test",
      "val":"123"
  }
    ]  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
cnt | Long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 19. 推送变更

### 描述

推送配置项变更

### 请求类型

POST

### 请求URL

/api/version/pushChange

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---

token | String | query | Y | api token
versionId | Long | query | Y | 版本ID

### 请求示例

```shell
curl --request POST -sL \
     --url 'http://ip:port/api/version/pushChange?token=03ecc4c8910b926f8fe1f0948&versionId=3'
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
cnt | Long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```