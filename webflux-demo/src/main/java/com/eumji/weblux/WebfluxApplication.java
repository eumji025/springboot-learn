package com.eumji.weblux;

import com.eumji.weblux.handler.HelloHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-17
 * @time: 下午3:33
 */
@SpringBootApplication
public class WebfluxApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebfluxApplication.class,args);
    }

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(HelloHandler helloHandler){
        return route(POST("/hello"),helloHandler::hello);
    }

}
