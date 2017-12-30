package com.eumji.mybatisxml;

import com.eumji.eutil.pagehelper.base.PageInfo;
import com.eumji.eutil.pagehelper.base.Pagination;
import com.eumji.mybatisxml.service.PageService;
import com.eumji.mybatisxml.vo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 17-12-30
 * @time: 下午3:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisXmlApplication.class)
public class PageHelperTest {

    @Autowired
    private PageService pageService;

    @Test
    public void pageHelperT(){
        PageInfo<UserInfo> userInfos = new PageInfo<>();
        userInfos.setPageNum(1);
        userInfos.setPageSize(10);
        Pagination info = pageService.getInfo(userInfos);
        System.out.println(info);
    }

}
