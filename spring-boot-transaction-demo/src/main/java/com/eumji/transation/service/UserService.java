package com.eumji.transation.service;

import com.eumji.transation.vo.UserInfo;

import java.util.List;

/**
 * @email eumji025@gmail.eumji
 * @author:EumJi
 * @date: 2017/9/30
 * @time: 13:43
 */
public interface UserService {

    UserInfo save(UserInfo userInfo);

    void saveList(List<UserInfo> userInfos);

    void saveListByTransSpread(List<UserInfo> userInfos);

    UserInfo findByName(String name);
}
