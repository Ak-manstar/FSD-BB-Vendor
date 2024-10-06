package com.fsd.vendor.bean;

public class Status {

    private Boolean code;
    private String message;

    public Status(boolean b, String msg) {
        code=b;
        message = msg;
    }

    public Boolean getCode() {
        return code;
    }

    public void setCode(Boolean code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
