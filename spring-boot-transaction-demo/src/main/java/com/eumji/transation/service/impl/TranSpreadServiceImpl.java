package com.eumji.transation.service.impl;

import com.eumji.transation.service.TranSpreadService;
import com.eumji.transation.vo.UserInfo;
import com.eumji.transation.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @email eumji025@gmail.eumji
 * @author:EumJi
 * @date: 2017/9/30
 * @time: 14:05
 */
@Service
public class TranSpreadServiceImpl implements TranSpreadService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void saveSpread(List<UserInfo> userInfos){
        for (UserInfo userInfo : userInfos) {
            userInfoDao.save(userInfo);
        }

        int i = 1/0;
    }
}
