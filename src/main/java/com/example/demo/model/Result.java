package com.example.demo.model;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean status = false;
    private String message;
    private T result;
    private String statusCode;

    public static <T> Result<T> error(String statusCode, String message) {
        return new Result(message, (Object)null, statusCode);
    }

    public static <T> Result<T> error(EdenResponseCode.EdenErrorCode errorCode) {
        return error(errorCode.getCode(), errorCode.getMsg());
    }

    public static <T> Result<T> success(T data, EdenResponseCode.EdenSuccessCode successCode) {
        return new Result(true, successCode.getMsg(), data, successCode.getCode());
    }

    public static <T> Result<T> success(T data) {
        return success(data, EdenBaseSuccessCode.SUCCESS);
    }

    public static <T> Result<T> success() {
        return (Result<T>) success((Object)null, EdenBaseSuccessCode.SUCCESS);
    }

    public Result() {
    }

    public Result(String message, T result, String statusCode) {
        this.message = message;
        this.result = result;
        this.statusCode = statusCode;
    }

    public Result(boolean status, String message, T result, String statusCode) {
        this.status = status;
        this.message = message;
        this.result = result;
        this.statusCode = statusCode;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}

