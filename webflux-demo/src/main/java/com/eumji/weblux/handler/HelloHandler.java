package com.eumji.weblux.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-17
 * @time: 下午4:03
 */
@Component
public class HelloHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().body(request.bodyToMono(String.class),String.class);
    }
}
