package com.eumji.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.eumji.indexPage.controller.PageController.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@Controller
public class PageController {
    @RequestMapping("/page")
    public String page(){
        return "hello";
    }
    @RequestMapping("/page2")
    public String page2(){
        return "hello2";
    }
}
