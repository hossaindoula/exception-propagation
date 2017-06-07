package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class NotSupportException extends ApiException {

    /**
     * @param message
     */
    public NotSupportException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public NotSupportException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public NotSupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatus getServiceStatus(){
        return HttpStatus.UNSUPPORTED_MEDIA_TYPE;
    }
}
