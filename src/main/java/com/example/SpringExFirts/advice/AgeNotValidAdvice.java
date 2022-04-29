package com.example.SpringExFirts.advice;

import com.example.SpringExFirts.controller.AgeNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AgeNotValidAdvice {

    @ResponseBody
    @ExceptionHandler(AgeNotValidException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    String ageNotValidHandler(AgeNotValidException ex){
        return ex.getMessage();
    }
}
