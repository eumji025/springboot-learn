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

3.在实体类添加别名注解@alisa("table-name")

4.在mapper添加@mapper注解

测试方法在test包下 可以写个controller


5.添加了自己基于pagehelper写的分页工具类,可以注释掉相关的代码或者回退版本
其实就是减少了一些中间代码.
