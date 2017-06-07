package com.example.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by doula_itc on 2017-06-07.
 */
@ControllerAdvice
public class ExceptionCatcher extends ResponseEntityExceptionHandler {


    @ExceptionHandler({ ApiException.class })
    public ResponseEntity<Object> handleBadRequest(final ApiException ex, final WebRequest request) {
        Map<String, Object> bodyOfResponse = new LinkedHashMap<>();
        bodyOfResponse.put("error_status", ex.getServiceStatus());
        bodyOfResponse.put("error_message", ex.getMessage());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), ex.getServiceStatus(), request);
    }
}
