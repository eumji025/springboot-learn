package com.eumji.redis.model;

import com.eumji.redis.BaseEntity;

import java.io.Serializable;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/29
 * @time: 11:26
 */
public class User extends BaseEntity {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
