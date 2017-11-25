package com.eumji.transation.vo;

import javax.persistence.*;

/**
 * @author Do
 * @package eumji.eumji.transation.vo
 * @name UserInfo
 * @date 2017/3/29
 * @time 12:20
 */
@Entity
@Table(name = "userinfo")
public class UserInfo {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String email;

    public UserInfo() {
    }

    public UserInfo(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
