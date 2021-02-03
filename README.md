# RCC配置中心
配置中心统一管理应用的资源配置信息，多是K-V结构，如memcached、db、redis等的配置，使配置信息不散落在各个项目，简化配置的维护；
支持多环境、多版本资源的管理，可以在不改变应用源码的情况下无缝切换配置。
配置服务的主要价值就是把系统各个环境，包括开发、测试和线上的所有配置内容统一管理起来。

## 快速开始

[部署手册](./doc/deploy-guide.md)

[管理端使用手册](./doc/manage-guide.md)

[Open Api 文档](./doc/open-api.md)

[JAVA SDK 使用手册](./doc/java-sdk-guide.md)

[快速体验](http://rcc2.baidu-int.com/#/login) 

## 测试
step1：先本地验证 mvn test（mvn clean package）
step2：将验证好的代码提交到agile流水线
step3：流水线自动进行case回归

单测案例请参考每个模块的test目录

## 如何贡献
提交代码patch之前，请先创建一个与之相关的issue
创建完issue后，提交merge request，参考如下步骤：
1. 访问icode上brcc代码库：https://console.cloud.baidu-int.com/devops/icode/repos/baidu/inner-os/brcc/tree/master
2. 创建新的分支（见名知意），如: brcc_add_protobuf
3. 在本地拉取代码，并切换到新分支，进行开发
4. 在提交代码之前，现在icode上创建issue单，得到一个issue号，如：baidu-inner-os-brcc-1，创建地址：https://console.cloud.baidu-int.com/devops/icafe/space/baidu-inner-os-brcc/queries/query/all
5. 用issue号提交ci，如 git commit -m "your desc; ISSUE=baidu-inner-os-brcc-1; git push origin HEAD:refs/for/your branch";
6. push后，会生成一个review地址，系统会自动提示相关同学review，你也可以提前与他们沟通；
7. 项目Master会审核你提交的代码，并决定是否通过；
8. 评审通过后，即可合入到远程分支（如 brcc_add_protobuf）
9. 进入你的远程分支，发布并合入主干
提示：为了节省你的时间，请一定先加入沟通讨论组（见下文如流号），与项目Master沟通后在提交patch

提交代码要求：
1. 功能和实现具有通用型，不是为了解决某个具体业务而定制的代码逻辑
2. 代码质量高
3. 需要补充对应的自动化case
4. 符合百度代码开发规范：[编码规范](http://wiki.baidu.com/pages/viewpage.action?pageId=706204530)


## 维护
角色 | 成员
---|---
owners|shinansheng, zengqingyong
Trusted Committers| shinansheng, zengqingyong

## 讨论

百度如流讨论群：【RCC配置中心接入沟通群】3664772

项目WIKI：[设计文档](http://wiki.baidu.com/pages/viewpage.action?pageId=1350573564)

