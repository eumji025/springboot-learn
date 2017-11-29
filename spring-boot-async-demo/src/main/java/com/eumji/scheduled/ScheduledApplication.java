package com.eumji.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author Do
 * @package eumji.eumji.task
 * @name Application
 * @date 2017/3/29
 * @time 13:16
 */
@SpringBootApplication
@EnableAsync
public class ScheduledApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class,args);
    }
}
