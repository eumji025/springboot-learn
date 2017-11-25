package com.eumji.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author eumji
 * @package com.eumji.exception.controller
 * @name IndexController
 * @date 2017/3/27
 * @time 13:04
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String indexPage(){
        return "index.html";
    }
}
