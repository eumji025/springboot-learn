package mapper.eumji.transation.dao;

import mapper.eumji.transation.vo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Do
 * @package com.eumji.transation.dao
 * @name UserDao
 * @date 2017/3/28
 * @time 13:35
 */
public interface UserInfoDao extends JpaRepository<UserInfo,Integer> {
    @Query("from UserInfo u where u.name=:name")
    UserInfo findUser(@Param("name") String name);

    UserInfo findByName(String name);


}
