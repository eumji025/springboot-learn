package com.eumji.properties.controller;

import com.eumji.properties.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试使用配置文件设置值的controller
 * com.eumji.properties.controller
 *
 * @desc
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@RestController
public class UserController {
    @Autowired
    private UserInfo userInfo;
    @RequestMapping("/getUser")
    public UserInfo getUserInfo(){
        return userInfo;
    }
}
