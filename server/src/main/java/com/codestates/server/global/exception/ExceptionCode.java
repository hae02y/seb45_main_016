package com.codestates.server.global.exception;

import lombok.Getter;

//에러메세지 추후 추가예정.
public enum ExceptionCode {
    USER_NOT_FOUND(404, "User not found"),
    //User not in database
    USER_EXISTS(409, "User exists"),
    //User exists
    UNAUTHORIZED_USER(403, "Unauthorized user"),
    //Unauthorized user
    PASSWORD_NOT_MATCH(404, "Password does not match");
    //Password wrong


    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}