package com.eumji.weblux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-17
 * @time: 下午3:37
 */
@RestController
public class WebFluxController {


    @GetMapping("/mono/{name}")
    private Mono<String> hello(@PathVariable String name){
        //return ServerResponse.ok().body(request.bodyToMono(String.class),String.class);
        //return "hello "+ name;
        return Mono.create(stringMonoSink -> stringMonoSink.success(name));
    }

    @GetMapping("/flux/{name}")
     public Flux<String> hello2(@PathVariable String name){
        return Flux.create(stringFluxSink -> stringFluxSink.next("----").next(name).next("你好").complete());
    }
}
