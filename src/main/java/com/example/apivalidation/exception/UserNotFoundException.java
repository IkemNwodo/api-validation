package com.example.apivalidation.exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}
