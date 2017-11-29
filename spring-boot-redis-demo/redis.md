## redis-demo
本文只是简单的连接上redis
通过redisTemplate对redis进行数据操作
对于redis的更为复杂的操作,需要我们自己学习redis的几种数据结构,相对来说比较简单
  redisTemplate.expire(user.getId(),50, TimeUnit.SECONDS)设置过期时间

redis需要自己解压安装,默认没有密码

