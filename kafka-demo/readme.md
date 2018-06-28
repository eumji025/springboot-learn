## 介绍
运行demo前需要准备环境：
1. kafka-2.12
2. kafka参数修改
3. 启动kafka服务
4. 启动应用


下面详细介绍一下：
1.  kafka下载地址 https://www.apache.org/dyn/closer.cgi?path=/kafka/1.1.0/kafka_2.11-1.1.0.tgz
2. 进行kafka解压缩到指定目录
3. 修改kafka配置，zookeeper不用修改，server.properties
```properties
listeners=PLAINTEXT://:9092
advertised.listeners=PLAINTEXT://127.0.0.1:9092
```
此demo为简陋版的kafka，所以配置很少

4.启动zookeeper和kafka服务

./zookeeper-server-start.sh ../configookeeper.properties

./kafka-server-start.sh ../config/server.properties


5.启动应用程序即可看到效果。


6.需要debug一下消费情况

https://docs.spring.io/spring-kafka/reference/htmlsingle/#_preface