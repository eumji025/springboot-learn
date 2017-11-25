package test;

import com.eumji.transation.TransactionApplication;
import com.eumji.transation.service.UserService;
import com.eumji.transation.vo.UserInfo;
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
@SpringBootTest(classes = TransactionApplication.class)
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
        UserInfo user = userService.save(new UserInfo("zhangsan3", "lala","eumji@qq.eumji"));
        System.out.println(user);
    }


    @Test
    public void saveList(){
        ArrayList<UserInfo> userInfos = new ArrayList<UserInfo>();
        userInfos.add(new UserInfo("zhangsan555", "asdasd","eumji@qq.eumji"));
        userInfos.add(new UserInfo("lisisi", "wwewe","eumji@qq.eumji"));
        //userService.saveList(userInfos);

        userService.saveListByTransSpread(userInfos);
    }
}
