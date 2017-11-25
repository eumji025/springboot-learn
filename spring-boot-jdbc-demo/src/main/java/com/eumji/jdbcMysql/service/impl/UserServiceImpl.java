package com.eumji.jdbcMysql.service.impl;

import com.eumji.jdbcMysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Do
 * @package com.eumji.jdbcMysql.service.impl
 * @name UserServiceImpl
 * @date 2017/3/27
 * @time 17:30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addUser(String userName, int age) {
        jdbcTemplate.execute("insert into user(username,age) values('"+userName+"',"+age+")");
    }

    @Override
    public List<Map<String, Object>> getAllUser() {

        return  jdbcTemplate.queryForList("select userName,age from user");
    }

    @Override
    public void updateUser() {
        jdbcTemplate.update("update user set age=100 where userName='zhangsan'");
    }

    @Override
    public void deleteUserByName(String userName) {
        jdbcTemplate.update("delete from user where userName='"+userName+"'");
    }
}
