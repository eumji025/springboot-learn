package com.eumji.jdbcMysql;

import com.eumji.jdbcMysql.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * 简单的增删改查测试
 * @author Do
 * @package com.eumji.jdbcMysql
 * @name JdbcTemplateTest
 * @date 2017/3/27
 * @time 17:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationInit.class)
public class JdbcTemplateTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        userService.addUser("lisi",30);
    }

    @Test
    public void getAllUser(){
        List<Map<String ,Object>> list = userService.getAllUser();
        for (Map<String,Object> map:
             list) {
            System.out.println("userName:"+map.get("userName"));
            System.out.println("age:"+map.get("age"));
        }
    }

    @Test
    public void updateUser(){
        userService.updateUser();
    }

    @Test
    public void deleteUserByName(){
        userService.deleteUserByName("zhangsan");
    }

}
