package com.Task12.ControllerAdviceDemo.CustomExceptions;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException(String message){
        super(message);
    }
}
