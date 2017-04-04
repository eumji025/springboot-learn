package com.eumji.customPort.controller;

import com.eumji.customPort.util.CustomPortUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义端口controller
 * 实现applicationListener是为了获取端口号
 * com.eumji.customPort.controller
 *
 * @desc
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@RestController // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class IndexController implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    private int port;

    public int getPort() {
        return port;
    }

    @RequestMapping("/")
    public String getCustomPost(){
        return "自定义端口:"+this.getPort();
    }

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        this.port = event.getEmbeddedServletContainer().getPort();
    }


}
