package com.eumji.validation.controller;

import com.eumji.validation.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-3
 * @time: 下午3:15
 */
@RestController
public class HelloController {

    @Autowired
    DemoConfig demoConfig;

    @RequestMapping("hello")
    public void hello(){
        System.out.println(demoConfig);
    }
}
