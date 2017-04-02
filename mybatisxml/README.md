## mybatisXml
是通过mapper的xml格式方式进行数据操作的demo

### 关键部分
1.引入依赖
~~~xml
<dependency>
               <groupId>org.mybatis.spring.boot</groupId>
               <artifactId>mybatis-spring-boot-starter</artifactId>
               <version>1.1.1</version>
           </dependency>
~~~

2.配置文件

~~~yml
#数据库连接配置
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/jdbc
    username: root
    password: root
    driver-class-name: com.mysql.jdbc.Driver
#mynatis配置
mybatis:
  type-aliases-package: com.eumji.mybatisxml.vo
  #mapper加载路径
  mapper-locations: classpath:com/eumji/mybatisxml/mapper/*Mapper.xml
  #myatbis配置文件
  config-location: classpath:mybatis-conf.xml
~~~

