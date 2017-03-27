package com.eumji.jdbcMysql.service;

import java.util.List;
import java.util.Map;

/**
 * @author Do
 * @package com.eumji.jdbcMysql.service
 * @name UserService
 * @date 2017/3/27
 * @time 17:30
 */
public interface UserService {
    /**
     * 添加一个user
     * @param userName 姓名
     * @param age 年龄
     */
    void addUser(String userName, int age);

    /**
     * 查询所有
     * @return
     */
    List<Map<String,Object>> getAllUser();

    /**
     * 更新user
     */
    void updateUser();

    /**
     * 根据姓名删除用户
     * @param userName
     */
    void deleteUserByName(String userName);
}
