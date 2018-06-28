package com.eumji.cxf.cxfdemo.service;

import javax.jws.WebService;

/**
 * @description: write some thing of this file
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 2018-06-18-6-28
 */
@WebService
public interface HelloService {
    String sayHello(String name);
}
