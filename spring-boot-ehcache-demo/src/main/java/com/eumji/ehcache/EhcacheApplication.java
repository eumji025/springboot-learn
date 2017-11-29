package com.eumji.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author EumJi
 * @package com.eumji.ehcache
 * @name Application
 * @date 2017/3/30
 * @time 21:21
 */
@SpringBootApplication
@EnableCaching
public class EhcacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(EhcacheApplication.class,args);
    }
}
