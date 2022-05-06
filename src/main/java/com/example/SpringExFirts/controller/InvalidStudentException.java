package com.example.SpringExFirts.controller;

public class InvalidStudentException  extends RuntimeException{
    public InvalidStudentException(String message) {
        super(message);
    }
}
