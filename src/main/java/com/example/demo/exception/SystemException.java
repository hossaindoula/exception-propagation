package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class SystemException extends ApiException {

    private boolean needToAlert = true;

    /**
     * @param message
     */
    public SystemException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public SystemException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isNeedToAlert() {
        return needToAlert;
    }

    public void setNeedToAlert(boolean needToAlert) {
        this.needToAlert = needToAlert;
    }

    public HttpStatus getServiceStatus(){
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

}
