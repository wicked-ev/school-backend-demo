package com.example.school_backend_demo.student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class StudentNotFoundAdvice {
    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String StudentNotFoundHandler(StudentNotFoundException exp) {
        return exp.getMessage();
    }

}
