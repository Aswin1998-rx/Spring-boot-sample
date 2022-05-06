package com.example.SpringExFirts.advice;


import com.example.SpringExFirts.controller.InvalidStudentException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InvalidStudentAdvice {
    @ResponseBody
    @ExceptionHandler(InvalidStudentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String message(InvalidStudentException ex){
       return ex.getMessage();
    }
}
