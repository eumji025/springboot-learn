package com.eumji.exception.controller;

import com.eumji.exception.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author eumji
 * @package com.eumji.exception.controller
 * @name ExceptionController
 * @date 2017/3/27
 * @time 13:19
 */
@Controller
public class ExceptionController {

    @RequestMapping("errorPage")
    public String errorPage() throws Exception{
        throw new Exception("跳转页面失败");
    }

    @RequestMapping("errorInfo")
    @ResponseBody
    public String errorInfo() throws CustomException {
        throw new CustomException("获取数据错误");
    }
}
