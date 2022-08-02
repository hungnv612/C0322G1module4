package com.example.books.config;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@Component
@Aspect
public class ExceptionHandle {

    @Pointcut("execution(* com.example.books.controller.LibraryController.book*(..))")
    public void allMethod(){}

    @After("allMethod()")
    public void afterCallMethod(){
        System.err.println("Sách đã bị thay đổi" + LocalDateTime.now());
    }
}
