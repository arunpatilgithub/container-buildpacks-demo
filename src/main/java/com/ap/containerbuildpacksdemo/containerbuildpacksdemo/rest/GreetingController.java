package com.ap.containerbuildpacksdemo.containerbuildpacksdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    @GetMapping(path = "greeting")
    public Mono<String> getMessage() {
        return Mono.just("Hello World!");
    }

}
