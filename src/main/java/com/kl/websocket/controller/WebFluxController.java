/*
 * WebFluxController.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.kl.websocket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author damai
 *
 */
@RestController
public class WebFluxController {
    @GetMapping("hello_world")
    public Mono <String> sayHelloWorld(){
        return Mono.just("Hello World");
    }
}
