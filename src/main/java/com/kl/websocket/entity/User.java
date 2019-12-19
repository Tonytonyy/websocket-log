/*
 * User.java
 * Copyright 2019 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.kl.websocket.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author qingliang
 *
 */
@Setter
@Getter
@AllArgsConstructor
public class User {
    private String id;
    private String email;
    private String name;
}
