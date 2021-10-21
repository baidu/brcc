# JAVA SDK Guide

## Description

maven 
SDK Access[![brcc sdk](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk)
```xml
<dependency>
    <groupId>com.baidu.mapp</groupId>
    <artifactId>brcc-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Spring Boot Starter Access[![brcc sdk starter](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.baidu.mapp/brcc-sdk-starter)
```xml
<dependency>
    <groupId>com.baidu.mapp</groupId>
    <artifactId>brcc-sdk-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```
please use the latest version

## Configuration 

```yaml
rcc:
  cc-server-url: http://ip:port/
  project-name: example
  cc-password: 123456
  env-name: dev
  cc-version-name: 1.0
  log-properties: true
  enable-update-callback: true
  enable-interrupt-service: true
  enable-gray: false
```
| Configuration Name | Default | Required | Description |
| :-----| :----: | :----: | :---- |
| rcc.cc-server-url | null | YES | BRCC server URL |
| rcc.project-name | null | YES | project name |
| rcc.cc-password | null | YES | project api password |
| rcc.env-name | null | YES | environment name |
| rcc.cc-version-name | null | YES | version name |
| rcc.log-properties | false | NO | enable print configuration in log |
| rcc.enable-update-callback | false | YES | enable update callback |
| rcc.enable-interrupt-service | true | NO | whether to interrupt the service when API password is incorrect for the first loading |
| rcc.enable-gray | false | NO | enable gray |
| rcc.callback-interval | 2000 | NO | callback interval(ms) | 
| rcc.connection-timeout | 3000 | NO | connection timeout(ms) |
| rcc.read-timeout | 10000 | NO | read timeout(ms) |
| rcc.app-name | null | NO | application name |
| rcc.container-id-env-name | hostname | NO | containerId |
| rcc.idc-env-name | null | NO | IDC |
| rcc.use-only-site-local-interfaces | false | NO | only use the LAN IP |
| rcc.preferred-networks | null | NO | source networks(such as en0), separated by commas |
| rcc.ignored-interfaces | null | NO | ignore networks list, separated by commas |

## Update Configuration Automatically 

When **rcc.enable-update-callback** is true, BRCC will update configuration automatically.
You need to implement the interface: **com.baidu.brcc.ConfigItemChangedCallable**, and register it as a sring bean.
When there are configuration changes, you can click **Push Change** on the console, BRCC will push configuration automatically.

Example：
```java
@Configuration
public class ExampleConfiguration {

    @Bean
    public ConfigItemChangedCallable configItemChangedCallable() {
        return new DefaultConfigItemChangedCallable();
    }


}
```
DefaultConfigItemChangedCallable is the default change callback implementation provided by BRCC. It just prints the change log, and you can implement your own change business.
