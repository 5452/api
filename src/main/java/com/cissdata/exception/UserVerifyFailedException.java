package com.cissdata.exception;

public class UserVerifyFailedException extends Exception {

    public UserVerifyFailedException(){}

    public UserVerifyFailedException(String message) {
        super(message);
    }
}
