package com.eumji.redis.util;

import com.eumji.redis.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/29
 * @time: 12:31
 */
@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 设置object插入的封装方法
     * @param entity
     * @param timeout
     * @param timeUnit
     * @return
     */
    public String putValue(BaseEntity entity, Long timeout, TimeUnit timeUnit){
        entity.setId(UUID.randomUUID().toString());
        ValueOperations opsForValue = redisTemplate.opsForValue();
        opsForValue.set(entity.getId(),entity);
        //注意添加了才能设置过期时间
        if (timeout != null && timeout != null && timeout > 0) {
            redisTemplate.expire(entity.getId(), timeout,timeUnit);
        }
        return entity.getId();
    }


}
