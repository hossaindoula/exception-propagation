package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class ForbiddenException extends ApiException {

    /**
     * @param message
     */
    public ForbiddenException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ForbiddenException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public ForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatus getServiceStatus(){
        return HttpStatus.FORBIDDEN;
    }
}
