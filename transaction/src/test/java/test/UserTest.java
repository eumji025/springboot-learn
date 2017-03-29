package test;

import com.eumji.transation.Application;
import com.eumji.transation.dao.UserInfoDao;
import com.eumji.transation.vo.User;
import com.eumji.transation.vo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Do
 * @package test
 * @name UserTest
 * @date 2017/3/28
 * @time 13:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {

    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    public void getUser(){
        UserInfo user = userInfoDao.findByName("zhangsan");
        System.out.println(user);
    }

    @Test
    public void saveUserInfo(){
        UserInfo user = userInfoDao.save(new UserInfo("zhangsan", "hunan","eumji@qq.com"));
        userInfoDao.flush();
        System.out.println(user);
    }
}
