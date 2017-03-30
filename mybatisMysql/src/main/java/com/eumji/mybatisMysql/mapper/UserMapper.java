package com.eumji.mybatisMysql.mapper;

import com.eumji.mybatisMysql.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Do
 * @package mapper
 * @name userMapper.xml
 * @date 2017/3/27
 * @time 19:26
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user values(#{userName},#{age})")
    void insertUser(@Param("userName") String userName, @Param("age") int age);

    @Select("select * from user")
    List<User> selectAllUser();
}
