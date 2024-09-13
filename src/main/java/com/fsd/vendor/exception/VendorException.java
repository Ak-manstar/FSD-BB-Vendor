package com.fsd.vendor.exception;

import com.fsd.vendor.bean.ErrorBean;
import org.springframework.http.HttpStatus;

public class VendorException extends RuntimeException{

    private ErrorBean errorBean;
    private HttpStatus httpStatus;

    public VendorException(ErrorBean errorBean, HttpStatus httpStatus) {
        this.errorBean = errorBean;
        this.httpStatus = httpStatus;
    }

    public ErrorBean getErrorBean() {
        return errorBean;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String toString() {
        return "VendorException{" +
                "errorBean=" + errorBean +
                ", httpStatus=" + httpStatus +
                '}';
    }
}
