package com.example.SpringExFirts.controller;

public class AgeNotValidException extends RuntimeException{

    AgeNotValidException(int age){
        super("age is always positive"+age);

    }
}
