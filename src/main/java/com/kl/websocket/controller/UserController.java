/*
 * UserController.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.kl.websocket.controller;

import com.kl.websocket.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingliang
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService){
        this.userService = userService;
    }
}
