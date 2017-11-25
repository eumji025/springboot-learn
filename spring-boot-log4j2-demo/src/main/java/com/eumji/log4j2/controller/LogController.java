package com.eumji.log4j2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Do
 * @package eumji.eumji.log4j2.controller
 * @name LogController
 * @date 2017/3/28
 * @time 11:03
 */
@RestController
public class LogController {
    Logger log = LoggerFactory.getLogger(LogController.class);
    @RequestMapping("log")
    public String getLog(){
        log.info("this is info log");
        log.debug("this is debug log");
        log.error("this is error log");
        return "ok";
    }
}
