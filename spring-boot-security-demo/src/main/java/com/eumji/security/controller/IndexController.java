package com.eumji.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Do
 * @package com.eumji.security.controller
 * @name IndexController
 * @date 2017/3/30
 * @time 13:16
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        logger.info("index page");
        return "index";
    }

    /**
     * 登陆成功
     * @return
     */
    @RequestMapping("/hello")
    public String hello( ){
        logger.debug("hello page");
        return "hello";
    }

    /**
     * 登陆页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        logger.error("login page");
        return "login";
    }
}
