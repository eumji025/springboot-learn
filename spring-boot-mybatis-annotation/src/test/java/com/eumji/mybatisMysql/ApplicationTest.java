package com.eumji.mybatisMysql;

import com.eumji.mybatisMysql.ApplicationInit;
import com.eumji.mybatisMysql.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * 使用mapper注解测试类
 * @author Do
 * @package eumji.eumji.mybatisMysql
 * @name ApplicationTest
 * @date 2017/3/27
 * @time 21:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationInit.class)
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void addUser(){
        int admin = userMapper.insertUser("admin", 999);
        if (admin == 1){
            System.out.println("插入成功!!!");
        }
    }

   @Test
    public void getUser(){
       System.out.println(userMapper.selectAllUser());
    }
}
