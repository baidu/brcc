



- [open api 对外接口文档](#open-api-%E5%AF%B9%E5%A4%96%E6%8E%A5%E5%8F%A3%E6%96%87%E6%A1%A3)
  - [1. 获取工程 api token](#1-%E8%8E%B7%E5%8F%96%E5%B7%A5%E7%A8%8B-api-token)
    - [描述](#%E6%8F%8F%E8%BF%B0)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B)
    - [请求URL](#%E8%AF%B7%E6%B1%82url)
    - [请求参数（json body）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0json-body)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B)
  - [2. 获取工程下的所有环境](#2-%E8%8E%B7%E5%8F%96%E5%B7%A5%E7%A8%8B%E4%B8%8B%E7%9A%84%E6%89%80%E6%9C%89%E7%8E%AF%E5%A2%83)
    - [描述](#%E6%8F%8F%E8%BF%B0-1)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-1)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-1)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-1)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-1)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-1)
  - [3. 根据环境名称获取指定环境](#3-%E6%A0%B9%E6%8D%AE%E7%8E%AF%E5%A2%83%E5%90%8D%E7%A7%B0%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E7%8E%AF%E5%A2%83)
    - [描述](#%E6%8F%8F%E8%BF%B0-2)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-2)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-2)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string-1)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-2)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-2)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-2)
  - [4. 获取环境下所有版本](#4-%E8%8E%B7%E5%8F%96%E7%8E%AF%E5%A2%83%E4%B8%8B%E6%89%80%E6%9C%89%E7%89%88%E6%9C%AC)
    - [描述](#%E6%8F%8F%E8%BF%B0-3)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-3)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-3)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string-2)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-3)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-3)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-3)
  - [5. 根据版本名称获取指定版本](#5-%E6%A0%B9%E6%8D%AE%E7%89%88%E6%9C%AC%E5%90%8D%E7%A7%B0%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E7%89%88%E6%9C%AC)
    - [描述](#%E6%8F%8F%E8%BF%B0-4)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-4)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-4)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string-3)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-4)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-4)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-4)
  - [6. 获取所有配置项](#6-%E8%8E%B7%E5%8F%96%E6%89%80%E6%9C%89%E9%85%8D%E7%BD%AE%E9%A1%B9)
    - [描述](#%E6%8F%8F%E8%BF%B0-5)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-5)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-5)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string-4)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-5)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-5)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-5)
  - [7. 根据配置名称获取指定配置项](#7-%E6%A0%B9%E6%8D%AE%E9%85%8D%E7%BD%AE%E5%90%8D%E7%A7%B0%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E9%85%8D%E7%BD%AE%E9%A1%B9)
    - [描述](#%E6%8F%8F%E8%BF%B0-6)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-6)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-6)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string-5)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-6)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-6)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-6)
  - [8. 批量获取指定配置项](#8-%E6%89%B9%E9%87%8F%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E9%85%8D%E7%BD%AE%E9%A1%B9)
    - [描述](#%E6%8F%8F%E8%BF%B0-7)
    - [请求类型](#%E8%AF%B7%E6%B1%82%E7%B1%BB%E5%9E%8B-7)
    - [请求URL](#%E8%AF%B7%E6%B1%82url-7)
    - [请求参数（query string）](#%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0query-string-6)
    - [请求示例](#%E8%AF%B7%E6%B1%82%E7%A4%BA%E4%BE%8B-7)
    - [返回参数](#%E8%BF%94%E5%9B%9E%E5%8F%82%E6%95%B0-7)
    - [返回样例](#%E8%BF%94%E5%9B%9E%E6%A0%B7%E4%BE%8B-7)



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

## 6. 获取所有配置项

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


## 7. 根据配置名称获取指定配置项

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


## 8. 批量获取指定配置项

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
