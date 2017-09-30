package test;

import mapper.eumji.transation.Application;
import mapper.eumji.transation.dao.UserInfoDao;
import mapper.eumji.transation.service.UserService;
import mapper.eumji.transation.service.impl.TranSpreadServiceImpl;
import mapper.eumji.transation.vo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

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
    private UserService userService;

    @Test
    public void getUser(){
        UserInfo user = userService.findByName("zhangsan");
        System.out.println(user);
    }

    @Test
    public void saveUserInfo(){
        UserInfo user = userService.save(new UserInfo("zhangsan3", "lala","eumji@qq.com"));
        System.out.println(user);
    }


    @Test
    public void saveList(){
        ArrayList<UserInfo> userInfos = new ArrayList<UserInfo>();
        userInfos.add(new UserInfo("zhangsan555", "asdasd","eumji@qq.com"));
        userInfos.add(new UserInfo("lisisi", "wwewe","eumji@qq.com"));
        //userService.saveList(userInfos);

        userService.saveListByTransSpread(userInfos);
    }
}
