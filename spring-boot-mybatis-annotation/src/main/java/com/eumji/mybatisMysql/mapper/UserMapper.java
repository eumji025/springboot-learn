package com.eumji.mybatisMysql.mapper;

import com.eumji.mybatisMysql.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Do
 * @package eumji
 * @name userMapper.xml
 * @date 2017/3/27
 * @time 19:26
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user(username,age) values(#{userName},#{age})")
    int insertUser(@Param("userName") String userName, @Param("age") int age);

    @Select("select * from user")
    List<User> selectAllUser();
}
