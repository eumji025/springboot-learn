package com.eumji.transation.service.impl;

import com.eumji.transation.dao.UserInfoDao;
import com.eumji.transation.service.TranSpreadService;
import com.eumji.transation.service.UserService;
import com.eumji.transation.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/9/30
 * @time: 13:43
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private TranSpreadService tranSpreadService;

    @Override
    public UserInfo save(UserInfo userInfo) {
        UserInfo user = userInfoDao.save(userInfo);
        //userInfoDao.flush();
        return user;
    }

    @Transactional
    public void saveList(List<UserInfo> userInfos) {
        for (UserInfo userInfo : userInfos) {
            userInfoDao.save(userInfo);
        }
        //userInfoDao.flush();
        //抛异常 回滚
        //int i = 1 / 0;
    }

    @Transactional
    public void saveListByTransSpread(List<UserInfo> userInfos) {
        tranSave(userInfos);
    }

    @Override
    public UserInfo findByName(String name) {
        return userInfoDao.findByName(name);
    }


    /**
     * 传播性测试
     * 1. 私有方法不支持transactionl注解
     * 2. 就算使用了NOT_SUPPORTED 还是会被回滚
     * 3. 就算使用外部类调用方法 ,且注解卸载另外一个service不使用注入的方式 还是会被回滚
     *
     *  最终结果,只有使用注入方法的外部类,发生异常亦不会被回滚
     * @param userInfos
     */
    void tranSave(List<UserInfo> userInfos){
        /*for (UserInfo userInfo : userInfos) {
            userInfoDao.save(userInfo);
            //抛异常 不回滚
        }
        int i = 1 / 0;*/

        tranSpreadService.saveSpread(userInfos);
    }
}
