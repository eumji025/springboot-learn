package mapper.eumji.firstDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * eumji.eumji.firstDemo.controller
 *
 * @desc
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@RestController
public class HelloController {


    @RequestMapping("/")
    public String helloWorld(){
        return "this my first spring-boot application";
    }
}
