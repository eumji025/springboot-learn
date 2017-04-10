package com.eumji.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
    @RequestMapping("/")
    public String index(){
        logger.info("index page");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        logger.debug("hello page");
        return "hello";
    }
    @RequestMapping("login")
    public String login(){
        logger.error("login page");
        return "login";
    }
}
