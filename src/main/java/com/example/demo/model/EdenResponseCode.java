package com.example.demo.model;

public interface EdenResponseCode {
    String getCode();

    String getMsg();

    public interface EdenErrorCode extends EdenResponseCode {
    }

    public interface EdenSuccessCode extends EdenResponseCode {
    }
}
