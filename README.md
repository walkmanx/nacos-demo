## Nacos 配置管理与服务发现
### 引入依赖
    <!-- nacos 服务配置 -->
    <dependency>
        <groupId>com.alibaba.boot</groupId>
        <artifactId>nacos-config-spring-boot-starter</artifactId>
        <version>0.2.7</version>
    </dependency>

    <!-- nacos 服务发现 -->
    <dependency>
        <groupId>com.alibaba.boot</groupId>
        <artifactId>nacos-discovery-spring-boot-starter</artifactId>
        <version>0.2.7</version>
    </dependency>
    
### 启动配置管理
    通过调用 Nacos Open API 向 Nacos server 发布配置：dataId 为example，内容为useLocalCache=true
    
    curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=example&group=DEFAULT_GROUP&content=useLocalCache=true"
    
### 启动服务发现

    通过调用 Nacos Open API 向 Nacos server 注册一个名称为 example 服务
    
    curl -X PUT "http://127.0.0.1:8848/nacos/v1/ns/instance?serviceName=example&ip=127.0.0.1&port=8080"