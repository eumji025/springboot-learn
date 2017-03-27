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
 * @package com.eumji.exception.handler
 * @name GlobalExceptionHandler
 * @date 2017/3/27
 * @time 13:06
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e) throws Exception{
        ModelAndView view = new ModelAndView();
        view.addObject("exception",e);
        view.addObject("url",request.getRequestURL());
        view.setViewName("error");
        return view;
    }

    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public ResultMessage<String> jsonErrorHandler(HttpServletRequest request, CustomException e) throws Exception{
        ResultMessage<String> message = new ResultMessage<>();
        message.setUrl(request.getRequestURL().toString());
        message.setMessage(e.toString());
        message.setData("no data");
        message.setMessageCode(ResultMessage.ERRORCODE);
        return message;
    }


}
