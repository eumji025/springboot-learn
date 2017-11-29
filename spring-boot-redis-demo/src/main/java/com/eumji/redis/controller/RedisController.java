package com.eumji.redis.controller;

import com.eumji.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 *
 * redis测试controller
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/29
 * @time: 11:25
 */
@RestController
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    private final String REDIS_KEY = "redis";

    /**
     * 插入缓存
     * @param user
     * @return
     */
    @PostMapping("/users/user")
    public String addUser(@RequestBody User user){
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        user.setId(UUID.randomUUID().toString());
        operations.set(user.getId(),user);
        return user.getId();
    }

    /**
     * 从缓存中读取
     * @param id
     * @return
     */
    @GetMapping("/users/user/{id}")
    public User getUser(@PathVariable String id){
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        User user = operations.get(id);
        return user;
    }
}
