package com.eumji.exception.handler;

import com.eumji.exception.exception.CustomException;
import com.eumji.exception.util.ResultMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Do
 * @package eumji.eumji.exception.config
 * @name GlobalExceptionHandler
 * @date 2017/3/27
 * @time 13:06
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 页面跳转异常处理
     * 需要注意跳转页面的异常不能喝json数据格式异常一样
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e) throws Exception{
        ModelAndView view = new ModelAndView();
        view.addObject("exception",e);
        view.addObject("url",request.getRequestURL());
        view.setViewName("error");
        return view;
    }

    /**
     * json数据请求异常处理
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public ResultMessage<String> jsonErrorHandler(HttpServletRequest request, CustomException e) throws Exception{
        ResultMessage<String> message = new ResultMessage<String>();
        message.setUrl(request.getRequestURL().toString());
        message.setMessage(e.toString());
        message.setData("no data");
        message.setMessageCode(ResultMessage.ERRORCODE);
        return message;
    }



}
