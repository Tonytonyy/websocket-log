package com.kl.websocket.api;

import org.springframework.web.client.HttpClientErrorException;

public enum ResultCode implements IErrorCode{
    SUCCESS(200,"成功"),
    FAILED(500,"失败"),
    VALIDATE_FAILED(404,"参数校验失败"),
    UNAUTHORIZED(401,"没有登录或token已过期"),
    FORBIDDEN(403,"没有相关权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
