package com.example.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.google.common.collect.ImmutableMap;

/**
 * Created by doula_itc on 2017-06-07.
 */
@ControllerAdvice
public class ExceptionCatcher extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ ApiException.class })
    public ResponseEntity<Object> handleBadRequest(final ApiException ex, final WebRequest request) {
        return handleExceptionInternal(ex, 
                                       ImmutableMap.of("error_status", ex.getServiceStatus(), "error_message", ex.getMessage()), 
                                       new HttpHeaders(), ex.getServiceStatus(), request);
    }
}
