package mapper.eumji.transation.service;

import mapper.eumji.transation.vo.UserInfo;

import java.util.List;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/9/30
 * @time: 14:11
 */
public interface TranSpreadService {
    public void saveSpread(List<UserInfo> userInfos);
}
