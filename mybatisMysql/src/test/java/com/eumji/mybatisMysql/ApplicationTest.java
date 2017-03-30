package com.eumji.mybatisMysql;

import com.eumji.mybatisMysql.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * 使用mapper注解测试类
 * @author Do
 * @package com.eumji.mybatisMysql
 * @name ApplicationTest
 * @date 2017/3/27
 * @time 21:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationInit.class)
@Transactional
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void addUser(){
        userMapper.insertUser("admin",999);
        System.out.println("add success");
    }

   @Test
    public void getUser(){
       System.out.println(userMapper.selectAllUser());
    }
}
