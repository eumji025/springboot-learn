package com.eumji.properties.controller;

import com.eumji.properties.vo.RandomValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 随机属性值测试的controller
 * eumji.eumji.properties.controller.RandomController.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@RestController
public class RandomController {

    @Autowired
    private RandomValue randomValue;
    @RequestMapping("random")
    public RandomValue getRandomValue(){
        return randomValue;
    }
}
