package com.fsd.vendor.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class VendorControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value= VendorException.class)
    protected ResponseEntity<Object> handleTemplateException(VendorException exception){
        return new ResponseEntity<>(exception.getErrorBean(),exception.getHttpStatus());
    }
}
