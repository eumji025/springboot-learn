package com.eumji.mybatisMysql.dao;

import com.eumji.mybatisMysql.vo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Do
 * @package com.eumji.mybatisMysql.dao
 * @name UserDao
 * @date 2017/3/28
 * @time 9:03
 */
@Component
public class UserDao {
    private SqlSession sqlSession;
    public UserDao(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }

    public List<User> queryAllUser(){
        return sqlSession.selectList("selectList",User.class);
    }
}
