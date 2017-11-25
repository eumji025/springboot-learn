package com.eumji.transation.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Do
 * @package eumji.eumji.transation.vo
 * @name User
 * @date 2017/3/28
 * @time 13:34
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name ="id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "age")
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
