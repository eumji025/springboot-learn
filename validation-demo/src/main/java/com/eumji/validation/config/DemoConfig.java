package com.eumji.validation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-3
 * @time: 下午3:10
 */
@Component
@ConfigurationProperties(prefix = "eumji")
@Validated
public class DemoConfig {

    @NotEmpty
    private String email;

    @NotNull(message = "姓名不能为空")
    private String name;

    @NotNull
    @Max(100)
    private Integer age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoConfig{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
