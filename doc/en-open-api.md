- [Open API Guide](#open-api-guide)
  - [1. Get project API token](#1-get-project-api-token)
    - [Description](#description)
    - [Request type](#request-type)
    - [Request URL](#request-url)
    - [Request parameters（json body）](#request-parametersjson-body)
    - [Request example](#request-example)
    - [Return parameters](#return-parameters)
    - [Return example](#return-example)
  - [2. Query all environments](#2-query-all-environments)
    - [Description](#description-1)
    - [Request type](#request-type-1)
    - [Request URL](#request-url-1)
    - [Request parameters（query string）](#request-parametersquery-string)
    - [Request example](#request-example-1)
    - [Return parameters](#return-parameters-1)
    - [Return example](#return-example-1)
  - [3. Query environment by name](#3-query-environment-by-name)
    - [Description](#description-2)
    - [Request type](#request-type-2)
    - [Request URL](#request-url-2)
    - [Request parameters（query string）](#request-parametersquery-string-1)
    - [Request example](#request-example-2)
    - [Return parameters](#return-parameters-2)
    - [Return example](#return-example-2)
  - [4. Query all versions](#4-query-all-versions)
    - [Description](#description-3)
    - [Request type](#request-type-3)
    - [Request URL](#request-url-3)
    - [Request parameters（query string）](#request-parametersquery-string-2)
    - [Request example](#request-example-3)
    - [Return parameters](#return-parameters-3)
    - [Return example](#return-example-3)
  - [5. Query version by name](#5-query-version-by-name)
    - [Description](#description-4)
    - [Request type](#request-type-4)
    - [Request URL](#request-url-4)
    - [Request parameters（query string）](#request-parametersquery-string-3)
    - [Request example](#request-example-4)
    - [Return parameters](#return-parameters-4)
    - [Return example](#return-example-4)
  - [6. Query version by name(support gray)](#6-query-version-by-namesupport-gray)
    - [Description](#description-5)
    - [Request type](#request-type-5)
    - [Request URL](#request-url-5)
    - [Request parameters（query string）](#request-parametersquery-string-4)
    - [Request example](#request-example-5)
    - [Return parameters](#return-parameters-5)
    - [Return example](#return-example-5)
  - [7. Query groups](#7-query-groups)
    - [Description](#description-6)
    - [Request type](#request-type-6)
    - [Request URL](#request-url-6)
    - [Request parameters（query string）](#request-parametersquery-string-5)
    - [Request example](#request-example-6)
    - [Return parameters](#return-parameters-6)
    - [Return example](#return-example-6)
  - [8. Query all configurations](#8-query-all-configurations)
    - [Description](#description-7)
    - [Request type](#request-type-7)
    - [Request URL](#request-url-7)
    - [Request parameters（query string）](#request-parametersquery-string-6)
    - [Request example](#request-example-7)
    - [Return parameters](#return-parameters-7)
    - [Return example](#return-example-7)
  - [9. Query all configurations by group](#9-query-all-configurations-by-group)
    - [Description](#description-8)
    - [Request type](#request-type-8)
    - [Request URL](#request-url-8)
    - [Request parameters（query string）](#request-parametersquery-string-7)
    - [Request example](#request-example-8)
    - [Return parameters](#return-parameters-8)
    - [Return example](#return-example-8)
  - [10. Query configuration by name](#10-query-configuration-by-name)
    - [Description](#description-9)
    - [Request type](#request-type-9)
    - [Request URL](#request-url-9)
    - [Request parameters（query string）](#request-parametersquery-string-8)
    - [Request example](#request-example-9)
    - [Return parameters](#return-parameters-9)
    - [Return example](#return-example-9)
  - [11. Batch query configuration](#11-batch-query-configuration)
    - [Description](#description-10)
    - [Request type](#request-type-10)
    - [Request URL](#request-url-10)
    - [Request parameters（query string）](#request-parametersquery-string-9)
    - [Request example](#request-example-10)
    - [Return parameters](#return-parameters-10)
    - [Return example](#return-example-10)
  - [12. Add environment](#12-add-environment)
    - [Description](#description-11)
    - [Request type](#request-type-11)
    - [Request URL](#request-url-11)
    - [Request parameters（query string）](#request-parametersquery-string-10)
    - [Request example](#request-example-11)
    - [Return parameters](#return-parameters-11)
    - [Return example](#return-example-11)
  - [13. Add version](#13-add-version)
    - [Description](#description-12)
    - [Request type](#request-type-12)
    - [Request URL](#request-url-12)
    - [Request parameters（query string）](#request-parametersquery-string-11)
    - [Request example](#request-example-12)
    - [Return parameters](#return-parameters-12)
    - [Return example](#return-example-12)
  - [14. Add group](#14-add-group)
    - [Description](#description-13)
    - [Request type](#request-type-13)
    - [Request URL](#request-url-13)
    - [Request parameters（query string）](#request-parametersquery-string-12)
    - [Request example](#request-example-13)
    - [Return parameters](#return-parameters-13)
    - [Return example](#return-example-13)
  - [15. Add configuration](#15-add-configuration)
    - [Description](#description-14)
    - [Request type](#request-type-14)
    - [Request URL](#request-url-14)
    - [Request parameters（query string）](#request-parametersquery-string-13)
    - [Request example](#request-example-14)
    - [Return parameters](#return-parameters-14)
    - [Return example](#return-example-14)
  - [16. Update configuration](#16-update-configuration)
    - [Description](#description-15)
    - [Request type](#request-type-15)
    - [Request URL](#request-url-15)
    - [Request parameters（query string）](#request-parametersquery-string-14)
    - [Request example](#request-example-15)
    - [Return parameters](#return-parameters-15)
    - [Return example](#return-example-15)
  - [17. Delete configuration](#17-delete-configuration)
    - [Description](#description-16)
    - [Request type](#request-type-16)
    - [Request URL](#request-url-16)
    - [Request parameters（query string）](#request-parametersquery-string-15)
    - [Request example](#request-example-16)
    - [Return parameters](#return-parameters-16)
    - [Return example](#return-example-16)
  - [18. Batch update configuration](#18-batch-update-configuration)
    - [Description](#description-17)
    - [Request type](#request-type-17)
    - [Request URL](#request-url-17)
    - [Request parameters（query string）](#request-parametersquery-string-16)
    - [Request example](#request-example-17)
    - [Return parameters](#return-parameters-17)
    - [Return example](#return-example-17)
  - [19. Push configuration changes](#19-push-configuration-changes)
    - [Description](#description-18)
    - [Request type](#request-type-18)
    - [Request URL](#request-url-18)
    - [Request parameters（query string）](#request-parametersquery-string-17)
    - [Request example](#request-example-18)
    - [Return parameters](#return-parameters-18)
    - [Return example](#return-example-18)
  
# Open API Guide

## 1. Get project API token

### Description

Get open API access token

### Request type

POST

### Request URL

/api/auth

### Request parameters（json body）


Name | Type | Parameter form | Required | Description 
---|---|---|---|---
projectName| String | body | Y | project name
apiPassword| String | body | Y | project api password

### Request example

```json
{
    "projectName": "yourProjectName",
    "apiPassword": "yourProjectPassword"
}
```

### Return parameters

Name | Type | Description
---|---|---
projectId| Long | project ID
projectName| String | project name
token| String | project api token
neverExpired | Boolean | never expired，true: never，false: whether expired according to expiredTime
expiredTime| Long | expired time(ms)

### Return example

```json
{
    "status":0,
    "msg":"success",
    "data":{
        "projectId":6,
        "projectName":"your-project-name",
        "token":"04ecc5c89105461a90b98fe1f0948",
        "neverExpired":true,
        "expiredTime":0
    }
}
```

## 2. Query all environments

### Description

Query all environments

### Request type

GET

### Request URL

/api/environment

### Request parameters（query string）


Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | project api token

### Request example

```shell

curl --request GET -sL \
     --url 'http://ip:port/api/environment?token=03ecc4c891054616f8fe1f0948'

```

### Return parameters

Name | Type | Description
---|---|---
projectId| Long | project ID
environmentId| Long | environmentID
environmentName| String | environmentname

### Return example

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

## 3. Query environment by name

### Description

Query environment by name

### Request type

GET

### Request URL

/api/environment/{environmentName}

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | project api token
environmentName | String | path | Y | environment name

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/environment/dev?token=03ecc4c89105461a90b926f8fe1f0948'
```

### Return parameters

Name | Type | Description
---|---|---
projectId | Long | project ID
environmentId | Long | environment ID
environmentName | String | environment name

### Return example

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

## 4. Query all versions 

### Description

Query all versions  

### Request type

GET

### Request URL

/api/version

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | query | Y | environmentID

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/version?token=03ecc61a90b926f8fe1f0948&environmentId=3'
```

### Return parameters

Name | Type | Description
---|---|---
projectId | Long | project ID
environmentId | Long | environmentID
versionId | Long | version ID
versionName | String | version name
checkSum | String | version checkSum

### Return example

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

## 5. Query version by name

### Description

Query version by name 

### Request type

GET

### Request URL

/api/version/{versionName}

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | query | Y | environmentID
versionName | String | path | Y | version name


### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/version/1.0.0?token=03eccb926f8fe1f0948&environmentId=3'
```

### Return parameters

Name | Type | Description
---|---|---
projectId | Long | project ID
environmentId | Long | environmentID
versionId | Long | version ID
versionName | String | version name
checkSum | String | version checkSum

### Return example

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

## 6. Query version by name(support gray)

### Description

Query version by name(support gray) 

### Request type

GET

### Request URL

/api/v2/version/{versionName}

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | query | Y | environment ID
containerId | String | query | N | container ID
idc | String | query | N | idc
ip | String | query | N | ip
versionName | String | path | Y | main version name

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/v2/version/1.0.0?token=5461a26f8fe1f0948&environmentId=3'
```

### Return parameters

Name | Type | Description
---|---|---
projectId | Long | project ID
environmentId | Long | environmentID
versionId | Long | version ID
versionName | String | version name
checkSum | String | version checkSum

### Return example

```json
{
  "status": 0,
    "msg": "success",
    "data": {
        "projectId": 16,
        "environmentId": 49,
        "versionId": 94,
        "versionName": "Gray version 0",
        "checkSum": ""
    },
    "sts": 1628738798909
}
```

## 7. Query groups 

### Description

Query groups 

### Request type

GET

### Request URL

/api/group

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | version ID

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/group/1.0.0?token=03ecc4c891090b926f8fe1f0948&versionId=3'
```

### Return parameters

Name | Type | Description
---|---|---
groupId | Long | group ID
groupName | String | group name

### Return example

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

## 8. Query all configurations

### Description

Query all configurations

### Request type

GET

### Request URL

/api/item

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | environmentID

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/item?token=03ecc4c8910b926f8fe1f0948&versionId=3'
```

### Return parameters

Name | Type | Description
---|---|---
key | String | configuration name
value | String | configuration value

### Return example

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

## 9. Query all configurations by group 

### Description

Query all configurations by group 

### Request type

GET

### Request URL

/api/groupItem

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y| api token
groupId | Long | query | Y | group ID

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/groupItem?token=03ecc4c89106f8fe1f0948&groupId=3'
```

### Return parameters

Name | Type | Description
---|---|---
key | String | configuration name
value | String | configuration value

### Return example

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

## 10. Query configuration by name 

### Description

Query configuration by name 

### Request type

GET

### Request URL

/api/item/{itemName}

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | version ID
itemName | String | path | Y | configuration name

### Request example

```shell
curl --request GET -sL \
     --url 'http://ip:port/api/item/MySQL?token=03ecc4c8926f8fe1f0948&versionId=3'
```

### Return parameters

Name | Type | Description
---|---|---
key | String | configuration name
value | String | configuration value

### Return example

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


## 11. Batch query configuration 

### Description

Batch query configuration 

### Request type

POST

### Request URL

/api/item/batchItem

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | version ID
keys | List\<String\> | body | N | configuration keys 

### Request example

```json
{
    "versionId":3,
    "keys":[
        "k1",
        "k2"
    ]
}
```

### Return parameters

Name | Type | Description
---|---|---
key | String | configuration name
value | String | configuration value

### Return example

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

## 12. Add environment

### Description

Add environment

### Request type

POST

### Request URL

/api/environmentAdd

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
name | String | body | Y | environment name
memo | String | body | N | environment description

### Request example

```json
{
  "name":"dev",
  "memo":"dev env"  
}
```

### Return parameters

Name | Type | Description
---|---|---
id | Long | environment ID

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 13. Add version 

### Description

Add version 

### Request type

POST

### Request URL

/api/versionAdd

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
environmentId | Long | body | Y | environment ID
name | String | body | Y | version name
memo | String | body | N | version description

### Request example

```json
{
  "environmentId":50,
  "name":"1.0",
  "memo":"1.0version "  
}
```

### Return parameters

Name | Type | Description
---|---|---
id | Long | version ID

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 14. Add group 

### Description

Add group 

### Request type

POST

### Request URL

/api/groupAdd

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | version ID
name | String | body | Y | group name
memo | String | body | N | group description

### Request example

```json
{
  "versionId":63,
  "name":"g1",
  "memo":"description"  
}
```

### Return parameters

Name | Type | Description
---|---|---
id | Long | group ID

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 15. Add configuration 

### Description

Add configuration 

### Request type

POST

### Request URL

/api/itemAdd

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | version ID
groupId | Long | body | Y | group ID
key | String | body | Y | configuration name
value | String | body | Y | configuration value
memo | String | body | N | configuration description

### Request example

```json
{
  "versionId":63,
  "groupId":12,
  "key":"a",
  "value":"ssss",
  "memo":"description"  
}
```

### Return parameters

Name | Type | Description
---|---|---
id | Long | configuration ID

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 16. Update configuration 

### Description

Update configuration 

### Request type

POST

### Request URL

/api/itemEdit

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | version ID
key | String | body | Y | configuration name
value | String | body | N | configuration value
memo | String | body | N | configuration description

### Request example

```json
{
  "versionId":63,
  "key":"a",
  "value":"ssss",
  "memo":"description"  
}
```

### Return parameters

Name | Type | Description
---|---|---
cnt | Long | count

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":2
}
```

## 17. Delete configuration 

### Description

Delete configuration 

### Request type

POST

### Request URL

/api/itemDelete

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | version ID
key | String | body | Y | configuration name

### Request example

```json
{
  "versionId":63,
  "key":"a"
}
```

### Return parameters

Name | Type | Description
---|---|---
cnt | Long | count

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 18. Batch update configuration 

### Description

Batch update configuration 

### Request type

POST

### Request URL

/api/batchSave

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | body | Y | version ID
groupId | Long | body | Y | group ID
items | List\<Object\> | body | N | configuration list
items[i].name | String | body | Y | configuration name
items[i].memo | String | body | N | configuration description
items[i].val | String | body | N | configuration value

### Request example

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

### Return parameters

Name | Type | Description
---|---|---
cnt | Long | count

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```

## 19. Push configuration changes

### Description

Push configuration changes 

### Request type

POST

### Request URL

/api/version/pushChange

### Request parameters（query string）

Name | Type | Parameter form | Required | Description
---|---|---|---|---
token | String | query | Y | api token
versionId | Long | query | Y | version ID

### Request example

```shell
curl --request POST -sL \
     --url 'http://ip:port/api/version/pushChange?token=03ecc4c8910b926f80948&versionId=3'
```

### Return parameters

Name | Type | Description
---|---|---
cnt | Long | count

### Return example

```json
{
  "status":0,
  "msg":"success",
  "data":1
}
```
