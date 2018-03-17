package com.eumji.weblux;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-3-17
 * @time: 下午4:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebfluxApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebfluxDemo {

    @Autowired
    WebTestClient webClient;

    @Test
    public void hello(){
       webClient.post().uri("/hello").contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.TEXT_PLAIN).body(Mono.just("hello man"), String.class)
                .exchange().expectBody(String.class).isEqualTo("hello man");
        //System.out.println(hello_man);
    }

    @Test
    public void testEcho() {
        webClient.post().uri("/hello").contentType(MediaType.TEXT_PLAIN)
                .accept(MediaType.TEXT_PLAIN)
                .body(Mono.just("Hello WebFlux!"), String.class).exchange()
                .expectBody(String.class).isEqualTo("Hello WebFlux!");
    }
}
