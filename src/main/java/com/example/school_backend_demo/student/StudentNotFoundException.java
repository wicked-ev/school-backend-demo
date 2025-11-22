package com.example.school_backend_demo.student;

public class StudentNotFoundException extends RuntimeException {

    StudentNotFoundException(Long id) {
        super("Could not find student");
    }
}
