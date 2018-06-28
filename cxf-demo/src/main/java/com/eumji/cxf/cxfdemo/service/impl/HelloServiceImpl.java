package com.eumji.cxf.cxfdemo.service.impl;

import com.eumji.cxf.cxfdemo.service.HelloService;

import javax.jws.WebService;

/**
 * @description: write some thing of this file
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 2018-06-18-6-28
 */
@WebService(endpointInterface = "com.eumji.cxf.cxfdemo.service.HelloService",serviceName = "/Hello")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
