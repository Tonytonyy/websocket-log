/*
 * UserService.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.kl.websocket.service;

import com.kl.websocket.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author damai
 *
 */
@Service
public class UserService {
    private final Map <String, User> data = new ConcurrentHashMap <>();

    Flux<User> list(){
        return Flux.fromIterable(this.data.values());
    }

    Flux<User> getById(Flux<String> ids){
        return ids.flatMap(id -> Mono.justOrEmpty(this.data.get(id)));
    }
    Mono<User> getById(String id){
        return Mono.justOrEmpty(this.data.get(id))
                .switchIfEmpty(Mono.error(new NoClassDefFoundError()));
    }
    Mono<User> createOrUpdate(final User user) {
        this.data.put(user.getUsername(), user);
        return Mono.just(user);
    }
    Mono<User> delete(String id){
        return Mono.justOrEmpty(this.data.remove(id));
    }

}
