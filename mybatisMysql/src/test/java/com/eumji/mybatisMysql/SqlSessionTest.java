package com.eumji.mybatisMysql;

import com.eumji.mybatisMysql.dao.UserDao;
import com.eumji.mybatisMysql.vo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Do
 * @package com.eumji.mybatisMysql
 * @name SqlSessionTest
 * @date 2017/3/28
 * @time 9:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationInit.class)
public class SqlSessionTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void queryAllUser() {
        List<User> users = userDao.queryAllUser();
        System.out.println(users);
    }

    @TestConfiguration
    public static class config {
    @Bean
    public UserDao config(SqlSession sqlSession) {
        return new UserDao(sqlSession);
    }
}
}
