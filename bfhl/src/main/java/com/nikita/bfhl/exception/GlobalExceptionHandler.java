package com.nikita.bfhl.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Map<String, Object> handleException(Exception e) {

        Map<String, Object> response = new HashMap<>();

        response.put("is_success", false);
        response.put("message", e.getMessage());

        return response;
    }
}
