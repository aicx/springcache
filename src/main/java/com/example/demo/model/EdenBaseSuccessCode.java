package com.example.demo.model;

public enum EdenBaseSuccessCode implements EdenResponseCode.EdenSuccessCode {
    SUCCESS("200", "成功");

    private final String code;
    private final String msg;

    private EdenBaseSuccessCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
