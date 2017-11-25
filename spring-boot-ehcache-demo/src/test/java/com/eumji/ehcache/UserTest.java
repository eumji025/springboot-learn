package com.eumji.ehcache;

import com.eumji.ehcache.dao.UserRepository;
import com.eumji.ehcache.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Do
 * @package eumji.eumji.ehcache
 * @name UserTest
 * @date 2017/3/30
 * @time 21:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addUser(){
        userRepository.save(new User("zhangsan",18));
    }

    @Test
    public void getUser(){
        User user = userRepository.findByUserName("zhangsan");
        System.out.println(user);

        User user2 = userRepository.findByUserName("zhangsan");
        System.out.println(user2);

    }
}
