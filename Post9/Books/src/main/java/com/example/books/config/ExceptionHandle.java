package com.example.books.config;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class ExceptionHandle {

    @ExceptionHandler(Exception.class)
    public String showError() {
        return "error";
    }

}
