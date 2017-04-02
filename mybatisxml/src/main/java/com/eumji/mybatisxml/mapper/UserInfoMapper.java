package com.eumji.mybatisxml.mapper;

import com.eumji.mybatisxml.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Do
 * @package mapper
 * @name userMapper.xml
 * @date 2017/3/27
 * @time 19:26
 */
@Mapper
public interface UserInfoMapper {

    void insertUser(@Param("userName") String userName, @Param("sex") String sex);

    List<UserInfo> selectAllUser();

    void updateUser(UserInfo userInfo);
}
