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
  - [6. 获取版本下所有分组](#6-获取版本下所有分组)
    - [描述](#描述-5)
    - [请求类型](#请求类型-5)
    - [请求URL](#请求url-5)
    - [请求参数（query string）](#请求参数query-string-4)
    - [请求示例](#请求示例-5)
    - [返回参数](#返回参数-5)
    - [返回样例](#返回样例-5)
  - [7. 获取所有配置项](#7-获取所有配置项)
    - [描述](#描述-6)
    - [请求类型](#请求类型-6)
    - [请求URL](#请求url-6)
    - [请求参数（query string）](#请求参数query-string-5)
    - [请求示例](#请求示例-6)
    - [返回参数](#返回参数-6)
    - [返回样例](#返回样例-6)
  - [8. 根据分组获取分组下配置项](#8-根据分组获取分组下配置项)
    - [描述](#描述-7)
    - [请求类型](#请求类型-7)
    - [请求URL](#请求url-7)
    - [请求参数（query string）](#请求参数query-string-6)
    - [请求示例](#请求示例-7)
    - [返回参数](#返回参数-7)
    - [返回样例](#返回样例-7)
  - [9. 根据配置名称获取指定配置项](#9-根据配置名称获取指定配置项)
    - [描述](#描述-8)
    - [请求类型](#请求类型-8)
    - [请求URL](#请求url-8)
    - [请求参数（query string）](#请求参数query-string-7)
    - [请求示例](#请求示例-8)
    - [返回参数](#返回参数-8)
    - [返回样例](#返回样例-8)
  - [10. 批量获取指定配置项](#10-批量获取指定配置项)
    - [描述](#描述-9)
    - [请求类型](#请求类型-9)
    - [请求URL](#请求url-9)
    - [请求参数（query string）](#请求参数query-string-8)
    - [请求示例](#请求示例-9)
    - [返回参数](#返回参数-9)
    - [返回样例](#返回样例-9)
  - [11. 新增配置项](#11-新增配置项)
    - [描述](#描述-10)
    - [请求类型](#请求类型-10)
    - [请求URL](#请求url-10)
    - [请求参数（query string）](#请求参数query-string-9)
    - [请求示例](#请求示例-10)
    - [返回参数](#返回参数-10)
    - [返回样例](#返回样例-10)
  - [12. 修改配置项](#12-修改配置项)
    - [描述](#描述-11)
    - [请求类型](#请求类型-11)
    - [请求URL](#请求url-11)
    - [请求参数（query string）](#请求参数query-string-10)
    - [请求示例](#请求示例-11)
    - [返回参数](#返回参数-11)
    - [返回样例](#返回样例-11)
  - [13. 删除配置项](#13-删除配置项)
    - [描述](#描述-12)
    - [请求类型](#请求类型-12)
    - [请求URL](#请求url-12)
    - [请求参数（query string）](#请求参数query-string-11)
    - [请求示例](#请求示例-12)
    - [返回参数](#返回参数-12)
    - [返回样例](#返回样例-12)
  - [14. 批量修改配置项](#14-批量修改配置项)
    - [描述](#描述-13)
    - [请求类型](#请求类型-13)
    - [请求URL](#请求url-13)
    - [请求参数（query string）](#请求参数query-string-12)
    - [请求示例](#请求示例-13)
    - [返回参数](#返回参数-13)
    - [返回样例](#返回样例-13)
  
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
projectId| long | 工程ID
projectName| String | 工程名称
token| String | 访问工程的 api token
neverExpired | boolean | 是否永不过期，true: 永不过期，false: 根据expiredTime判断是否过期
expiredTime| long | 过期时间，时间戳形式，单位为毫秒

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
projectId| long | 工程ID
environmentId| long | 环境ID
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
environmentName | String | path | y | 环境名称

### 请求示例

```shell


```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | long | 工程ID
environmentId | long | 环境ID
environmentName | string | 环境名称

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
token | String | query | y | api token
environmentId | long | query | y | 环境ID

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | long | 工程ID
environmentId | long | 环境ID
versionId | long | 版本ID
versionName | string | 版本名称
checkSum | string | 版本checkSum

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
token | String | query | y | api token
environmentId | long | query | y | 环境ID
versionName | String | path | y | 环境名称

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
projectId | long | 工程ID
environmentId | long | 环境ID
versionId | long | 版本ID
versionName | string | 版本名称
checkSum | string | 版本checkSum

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
## 6. 获取版本下所有分组

### 描述

获取版本下所有分组

### 请求类型

GET

### 请求URL

/api/group

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | y | api token
versionId | long | query | y | 版本ID

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
groupId | long | 分组ID
groupName | string | 分组名称

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

## 7. 获取所有配置项

### 描述

获取所有配置项

### 请求类型

GET

### 请求URL

/api/item

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | y | api token
versionId | long | query | y | 环境ID

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | string | 配置项名称
value | string | 配置值

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

## 8. 根据分组获取分组下配置项

### 描述

根据分组获取分组下配置项

### 请求类型

GET

### 请求URL

/api/groupItem

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | y | api token
groupId | long | query | y | 分组ID

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | string | 配置项名称
value | string | 配置值

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

## 9. 根据配置名称获取指定配置项

### 描述

根据配置名称获取指定配置项

### 请求类型

GET

### 请求URL

/api/item/{itemName}

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | y | api token
versionId | long | query | y | 版本ID
itemName | String | path | y | 配置名称

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | string | 配置项名称
value | string | 配置值

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


## 10. 批量获取指定配置项

### 描述

批量获取指定配置项

### 请求类型

POST

### 请求URL

/api/item/batchItem

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
token | String | query | y | api token
versionId | long | body | y | 版本ID
keys | List\<String\> | body | n | 如果为空则获取版本下的所有配置项

### 请求示例

```shell

```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
key | string | 配置项名称
value | string | 配置值

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

## 11. 新增配置项

### 描述

新增配置项

### 请求类型

POST

### 请求URL

/api/itemAdd

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
apiToken | String | query | y | api token
versionId | long | body | y | 版本ID
groupId | long | body | y | 分组ID
key | String | body | y | 配置项名称
value | String | body | y | 配置项值
memo | String | body | n | 配置项简介

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
id | long | 配置项ID

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 12. 修改配置项

### 描述

修改配置项

### 请求类型

POST

### 请求URL

/api/itemEdit

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
apiToken | String | query | y | api token
versionId | long | body | y | 版本ID
key | String | body | y | 配置项名称
value | String | body | n | 配置项值
memo | String | body | n | 配置项简介

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
cnt | long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":2
}
```

## 13. 删除配置项

### 描述

删除配置项

### 请求类型

POST

### 请求URL

/api/itemDelete

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
apiToken | String | query | y | api token
versionId | long | body | y | 版本ID
key | String | body | y | 配置项名称

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
cnt | long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 14. 批量修改配置项

### 描述

批量修改配置项

### 请求类型

POST

### 请求URL

/api/batchSave

### 请求参数（query string）

参数名称 | 类型 | 方式 | 必填 | 说明
---|---|---|---|---
apiToken | String | query | y | api token
versionId | long | body | y | 版本ID
groupId | long | body | y | 分组ID
items | List\<Object\> | body | n | 配置项列表
items[i].name | string | body | y | 配置项名称
items[i].memo | string | body | n | 配置项简介
items[i].val | string | body | n | 配置项值

### 请求示例

```json
{
  "versionId":3,
  "groupId":60,
  "items":[
    {
      "key":"test",
      "value":"123"
  }
    ]  
}
```

### 返回参数

参数名称 | 类型 | 说明
---|---|---
cnt | long | 影响行数

### 返回样例

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```