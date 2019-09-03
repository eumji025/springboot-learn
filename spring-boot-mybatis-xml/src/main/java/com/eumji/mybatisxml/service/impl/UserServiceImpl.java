package com.eumji.mybatisxml.service.impl;

import com.eumji.mybatisxml.mapper.UserInfoMapper;
import com.eumji.mybatisxml.service.User2Service;
import com.eumji.mybatisxml.service.UserService;
import com.eumji.mybatisxml.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    User2Service user2Service;

    @Transactional
    @Override
    public void insertUser(UserInfo userInfo) {
        userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());
        insertUser5(userInfo);
        //int a = 1/0;
    }

    @Transactional
    public void insertUser2(UserInfo userInfo) {
        insertUser4(userInfo);
        //userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());
        //int a = 1/0;
    }


    //私有方法的事务是不会生效的
    @Transactional
    private void insertUser3(UserInfo userInfo) {
        //
        userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());
        int a = 1/0;
    }

    //调用当前service的事务方法不会开启
    @Transactional
    public void insertUser4(UserInfo userInfo) {
        //
        userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());
        int a = 1/0;
    }


    //当被insertUser调用的时候是可以生效的
    //因为在同一线程的上下文中，所以都被我外部的事务包揽
    //@Transactional
    public void insertUser5(UserInfo userInfo) {
        //
        userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());

    }


    //检测requireNew的功能特性
    @Transactional
    public void insertUser6(UserInfo userInfo) {
        //
        userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());
        user2Service.insertUser(userInfo);
    }

    //检测嵌套事务的特性
    @Transactional
    public void insertUser7(UserInfo userInfo) {
        //
        userInfoMapper.insertUser(userInfo.getName(),userInfo.getSex());
        user2Service.insertUser2(userInfo);
       // int a = 1/0;
    }

}
