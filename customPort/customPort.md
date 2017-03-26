# CustomPort
此demo主要是用来设置自定义springboot启动端口的

### 流程
1. 首先需要实现EmbeddedServletContainerCustomizer接口
从而设置端口号
2. 然后需要实现EmbeddedServletContainerInitializedEvent接口
获取端口号
