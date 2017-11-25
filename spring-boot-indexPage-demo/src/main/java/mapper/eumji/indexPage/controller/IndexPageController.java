package mapper.eumji.indexPage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * eumji.eumji.indexPage.controller.IndexPageController.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@Controller
public class IndexPageController {

    @RequestMapping("/indexPage")
    public String toIndexPage(){
        return "index.html";
    }
}
