/*
 * UserController.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.kl.websocket.controller;

import com.kl.websocket.api.CommonResult;
import com.kl.websocket.entity.User;
import com.kl.websocket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qingliang
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private  UserService userService;

    @RequestMapping(value = "/query")
    public CommonResult<User> query(){
        return CommonResult.success(userService.query());
    }
}
