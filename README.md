# tk-admin
tk-admin是基于`Spring 
Cloud`微`服务`化`开发平台`，具有统一授权、认证后台管理系统，其中包含具备用户管理、资源权限管理、网关API
管理等多个模块，支持多业务系统并行开发，可以作为后端服务的开发脚手架。代码简洁，架构清晰，适合学习和直接项目中使用。
核心技术采用`Spring Boot 
2.0.1`以及`Spring Cloud (Finchley.RELEASE)
`相关核心组件，采用`Consul注册中心`，前端采用`vue-element-admin`组件。 

# 模块说明
![image.png](http://upload-images.jianshu.io/upload_images/5700335-8d69f4e885a4ec85.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 架构摘要
#### 服务鉴权
通过`JWT`的方式来加强服务之间调度的权限验证，保证内部服务的安全性。

#### 监控
利用Spring Boot Admin 来监控各个独立Service的运行状态；利用Hystrix Dashboard来实时查看接口的运行状态和调用频率等。

#### 负载均衡
将服务保留的rest进行代理和网关控制，除了平常经常使用的node.js、nginx外，Spring Cloud系列的zuul和ribbon，可以帮我们进行正常的网关管控和负载均衡。其中扩展和借鉴国外项目的扩展基于JWT的`Zuul限流插件`，方面进行限流。

#### 服务注册与调用
基于Consul来实现的服务注册与调用，在Spring Cloud中使用Feign, 我们可以做到使用HTTP请求远程服务时能与调用本地方法一样的编码体验，开发者完全感知不到这是远程方法，更感知不到这是个HTTP请求。

#### 熔断机制
因为采取了服务的分布，为了避免服务之间的调用“雪崩”，采用了`Hystrix`的作为熔断器，避免了服务之间的“雪崩”。

------

## 功能截图

### 基本功能

![image.png](https://geek_qi.oschina.io/ag-admin/img/consul.png)

![image.png](https://upload-images.jianshu.io/upload_images/5700335-6cc59493c7726637.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![image.png](https://upload-images.jianshu.io/upload_images/5700335-c1d6c24e3b126677.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


![image.png](https://thumbnail0.baidupcs.com/thumbnail/58d885b9bd83bf3559a798fa4ae5db92?fid=2032845954-250528-723217542877415&time=1572922800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-0WKSMNszrs6vWe93Db92kgflMjE%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=7154785645421156827&dp-callid=0&size=c710_u400&quality=100&vuk=-&ft=video)

![image.png](https://thumbnail0.baidupcs.com/thumbnail/ff8d5d00c445a5765dfad245268942cb?fid=2032845954-250528-713701302941697&time=1572922800&rt=sh&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-KuaYgG%2FXcIVsMsJ4ekLVzihEpX4%3D&expires=8h&chkv=0&chkbd=0&chkpc=&dp-logid=7154821635266426346&dp-callid=0&size=c710_u400&quality=100&vuk=-&ft=video)
##  License
Apache License Version 2.0