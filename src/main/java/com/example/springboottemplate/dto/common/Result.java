package com.example.springboottemplate.dto.common;


public class Result<T> {

    private Integer code;
    private String message;
    private String trace;
    private T res;

    public Result() {

    }

    public Result(ResultCode resultCode, String message, String trace, T res) {
        this.code = resultCode.code();
        this.message = message;
        this.trace = trace;
        this.res = res;
    }

    public static <T> Result success(T res) {
        return new Result(ResultCode.SUCCESS, null, null, res);
    }

    public static <T> Result failure(T res, String message, String trace) {
        return new Result(ResultCode.ERROR, message, trace, res);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public T getRes() {
        return res;
    }

    public void setRes(T res) {
        this.res = res;
    }
}
