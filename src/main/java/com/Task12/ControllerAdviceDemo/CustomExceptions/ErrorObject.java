package com.Task12.ControllerAdviceDemo.CustomExceptions;

import lombok.Data;

@Data
public class ErrorObject {

    private int statusCode;

    private String message;

    private long timestamp;
}
