package com.eumji.weblux;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.util.function.Consumer;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-17
 * @time: 下午3:37
 */
@RestController
public class WebFluxController {


    @GetMapping("/demo/{name}")
    Mono<String> hello(@PathVariable String name){
        //return ServerResponse.ok().body(request.bodyToMono(String.class),String.class);
        //return "hello "+ name;
        return Mono.create(stringMonoSink -> stringMonoSink.success(name));
    }
}
