---
sidebarDepth: 0
---
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
