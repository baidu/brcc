# Guide

## Description
Better Remote Config Center(BRCC) is a distributed config center, which is used to uniformly manage the configuration information of application services, avoid the spread of  resources in various projects, and simplify the maintenance cost of resources. As a lightweight solution, BRCC is simple to deploy, supports multi-environment, multi-version, multi-role resource management, and can seamlessly switch and take real-time configuration information without changing the source code.
BRCC consists of three parts: console, server and SDK:
- **Console**: Based on Spring Boot 2.0. Support six dimensions of product, project, environment, version, group and configuration. Support Fine-grained access control, operation log and configuration in key-value format. Support multi-environment, multi-version and multi-role. Support plug-in extensions to easily integrate any company/organization account management system.
- **Server**: Based on Spring Boot 2.0. Support configuration distribution and hot update.
- **SDK**: Support JAVA and Go. Support spring annotation, configuration change monitoring and updating. You can use it with spring boot starter.

## Feature
1. Management of the configuration in  multiple environments and products
    - Manage the configuration of multiple environments, products, and projects on the console
    - Complete the configuration of new application efficiently by copying the version

2. Real-time configuration take effect
    - Take effect in 2 seconds by default
    - Push safely

3. Authority management, role isolation
    - Multi-permissions, multi-role
    - Read and write permissions
    - Encrypted interaction
    - Token mechanism

4. Multi-language support
    - Support JAVA and Go
    - Support restful API (Http)

5. Traceable
    - Trace operation log
    - Query historical configuration

6. Cacheable
    - Support cache configuration

7. Lightweight
    - Easy to deploy
    - Focus on the configuration management

8. Convenient for query
    - key-value configuration
    - Support fuzzy search

## User Guide
You can learn how to use BRCC by these guides.

[Quick Start](./start.md)

[Deploy Guide](./deploy.md)

[Open API Guide](./api.md)

[Java SDK Guide](./java-sdk.md)

[Go SDK Guide](./go-sdk.md)
