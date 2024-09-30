package com.example.demo.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error"),
    USER_EXISTED(1001, "User existed"),
    PASSWORD_INVALID(1003, "Password must be at least 4 characters"),
    INVALID_KEY(1234,"Invalid message key"),
    PHONENUMBER_INVALID(1004, "Phone number must be at least 10 characters");
    private final int code;
    private final String message;


    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
