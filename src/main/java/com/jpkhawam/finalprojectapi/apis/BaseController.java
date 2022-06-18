package com.jpkhawam.finalprojectapi.apis;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseController {
    @ResponseBody
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<FieldErrorMessage> handleBindException(BindException e) {
        List<FieldErrorMessage> fieldErrorMessages = new ArrayList<>();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            FieldErrorMessage fieldErrorMessage = new FieldErrorMessage();
            fieldErrorMessage.setName(fieldError.getField());
            fieldErrorMessage.setMessage("Field is invalid. Make sure you pass in the correct data");
            fieldErrorMessages.add(fieldErrorMessage);
        }
        return fieldErrorMessages;
    }
}
