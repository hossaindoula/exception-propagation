package com.example.demo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by hossaindoula<hossain.doula@itconquest.com> on 2017-04-19.
 */
public class ServiceConditionException extends ApiException {

    private boolean needToAlert = false;

    /**
     * @param message
     */
    public ServiceConditionException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ServiceConditionException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public ServiceConditionException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean isNeedToAlert() {
        return needToAlert;
    }

    public void setNeedToAlert(boolean needToAlert) {
        this.needToAlert = needToAlert;
    }


    public HttpStatus getServiceStatus(){
        return HttpStatus.SERVICE_UNAVAILABLE;
    }

}
