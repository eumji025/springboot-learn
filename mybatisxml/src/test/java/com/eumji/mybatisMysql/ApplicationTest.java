package com.eumji.mybatisMysql;

import com.eumji.mybatisxml.Application;
import com.eumji.mybatisxml.mapper.UserInfoMapper;
import com.eumji.mybatisxml.vo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 使用mapper注解测试类
 * @author Do
 * @package com.eumji.mybatisMysql
 * @name ApplicationTest
 * @date 2017/3/27
 * @time 21:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Autowired
    private UserInfoMapper userInfoMapper;
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
        UserInfo userInfo = new UserInfo(1, "修改了名字的zhangsan", "women");
        userInfoMapper.updateUser(userInfo);
    }
}
