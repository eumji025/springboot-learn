package com.eumji.cxf.cxfdemo.config;

import com.eumji.cxf.cxfdemo.service.impl.HelloServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @description: cxf server deploay config
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 2018-06-18-6-28
 */
@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloServiceImpl());
        endpoint.publish("/Hello");
        return endpoint;
    }
}
