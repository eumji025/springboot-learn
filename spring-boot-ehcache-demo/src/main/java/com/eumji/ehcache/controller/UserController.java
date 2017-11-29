package com.eumji.ehcache.controller;

import com.eumji.ehcache.repository.UserRepository;
import com.eumji.ehcache.util.IteratorUtils;
import com.eumji.ehcache.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/29
 * @time: 10:26
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users/save")
    public String saveUser(@RequestBody User user){
        User save = userRepository.save(user);
        if (!Objects.isNull(save)){
            return "添加成功";
        }
        return "添加失敗";
    }

    /**
     * 查找所有 没有缓存
     * @return
     */
    @GetMapping("/users/finds")
    public List findUserList(){
        Iterable<User> userList = userRepository.findAll();
        List<User> users = IteratorUtils.copyIterator(userList.iterator());
        return users;
    }

    /**
     * 缓存 根据名称查找user
     *
     *  查询两次 只出现一次查询语句
     *  Hibernate: select user0_.id as id1_0_, user0_.age as age2_0_, user0_.user_name as user_nam3_0_ from user2 user0_ where user0_.user_name=?
     * @param userName
     * @return
     */
    @GetMapping("/user/user/{userName}")
    public User getByName(@PathVariable String userName){
        User user = userRepository.findByUserName(userName);
        return user;
    }

}
