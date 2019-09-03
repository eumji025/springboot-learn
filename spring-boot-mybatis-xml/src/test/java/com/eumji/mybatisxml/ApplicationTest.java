package com.eumji.mybatisxml;

import com.eumji.mybatisxml.mapper.UserInfoMapper;
import com.eumji.mybatisxml.service.UserService;
import com.eumji.mybatisxml.vo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 使用mapper注解测试类
 * @author eumji
 * @package eumji.eumji.mybatisMysql
 * @name ApplicationTest
 * @date 2017/3/27
 * @time 21:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisXmlApplication.class)
public class ApplicationTest {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserService userService;
    @Test
    public void addUser(){
        userInfoMapper.insertUser("admin","man");
        System.out.println("add success");
    }

   @Test
    public void getUser(){
       System.out.println(userInfoMapper.selectAllUser());
    }

    @Test
    public void updateUser(){
        UserInfo userInfo = new UserInfo(1, "修改了名字的liji", "women");
        userInfoMapper.updateUser(userInfo);
    }


    @Test
    public void rollbackTest(){
        UserInfo userInfo = new UserInfo(1, "修改了名字的liji", "women");
        userService.insertUser(userInfo);
    }


    @Test
    public void privateMethodTest(){
        UserInfo userInfo = new UserInfo(1, "修改了名字的liji222", "women");
        userService.insertUser2(userInfo);
    }


    @Test
    public void privateMethodTest3(){
        UserInfo userInfo = new UserInfo(1, "修改了名字的liji222", "women");
        userService.insertUser(userInfo);
    }
    @Test
    public void requiredNewTest(){
        UserInfo userInfo = new UserInfo(1, "修改了名字的liji222", "women");
        userService.insertUser6(userInfo);
    }
    @Test
    public void nestedTest(){
        UserInfo userInfo = new UserInfo(1, "修改了名字的liji222", "women");
        userService.insertUser7(userInfo);
    }
}
