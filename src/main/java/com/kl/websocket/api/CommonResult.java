package com.kl.websocket.api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonResult<T>{

    private long code;
    private String message;
    private T data;

    private CommonResult(){

    }

    private CommonResult(long code, String message, T data ){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T>CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    public static <T>CommonResult<T> success(T data,String message){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }
    public static  <T>CommonResult<T> failed(){
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(),null);
    }
    public static <T>CommonResult<T> failed(String message){
        return new CommonResult<T>(ResultCode.FAILED.getCode(), message,null);
    }

}
