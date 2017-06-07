package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class NotFoundException extends ApiException {

    /**
     * @param message
     */
    public NotFoundException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public NotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    HttpStatus getServiceStatus() {
        return HttpStatus.NOT_FOUND;
    }

}
