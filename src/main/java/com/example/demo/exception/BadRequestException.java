package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class BadRequestException extends ApiException {

    /**
     * @param message
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public BadRequestException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatus getServiceStatus(){
        return HttpStatus.BAD_REQUEST;
    }
}
