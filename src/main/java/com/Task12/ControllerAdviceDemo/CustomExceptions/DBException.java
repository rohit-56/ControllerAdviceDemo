package com.Task12.ControllerAdviceDemo.CustomExceptions;

public class DBException extends RuntimeException{
    public DBException(String message){
        super(message);
    }
}
