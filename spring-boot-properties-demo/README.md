## properties
此demo记录通过配置文件设置值

### random
在spring-boot中可以使用random获取随机值,主要有以下几种形式
~~~yml
   strValue: ${random.value}
      #随机int型value
      intValue: ${random.int}
      #随机long型value
      longValue: ${random.long}
      #随机uuid
      uuidValue: ${random.uuid}
      #区间value
      rangeValue: ${random.int[10000,20000]}
~~~


**注意:**
使用yml的所有配置文件都要写在application.yml中,不然会获取不到
使用application.properties时候可以配置多个.
