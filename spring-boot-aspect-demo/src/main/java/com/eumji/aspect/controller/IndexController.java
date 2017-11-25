package com.eumji.aspect.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * eumji.eumji.aspect.controller.IndexController.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 04
 * @day: 01
 * @time: 2017/4/1
 */
@RestController
public class IndexController {


    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }
}
