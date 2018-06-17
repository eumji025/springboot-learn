package com.eumji.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-6-17
 * @time: 下午3:09
 */
@SpringBootApplication
public class ElasticJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticJobApplication.class,args);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("spring boot will shutdown");
            }
        }));
    }
}
