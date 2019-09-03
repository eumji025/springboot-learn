package com.eumji.mybatisxml.mapper;

import com.eumji.eutil.pagehelper.base.PageInfo;
import com.eumji.mybatisxml.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author eumji
 * @package eumji
 * @name userMapper.xml
 * @date 2017/3/27
 * @time 19:26
 */
@Mapper
public interface UserInfoMapper {
    /*添加一条数据*/
    void insertUser(@Param("userName") String userName, @Param("sex") String sex);
    /*查询所有*/
    List<UserInfo> selectAllUser();
    /*更新一条*/
    void updateUser(UserInfo userInfo);

    List<UserInfo> getUserList(PageInfo pageInfo);
}
