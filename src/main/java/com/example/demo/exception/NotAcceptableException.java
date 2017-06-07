package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class NotAcceptableException extends ApiException {

    /**
     * @param message
     */
    public NotAcceptableException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public NotAcceptableException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public NotAcceptableException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatus getServiceStatus(){
        return HttpStatus.NOT_ACCEPTABLE;
    }
}
