package com.example.school_backend_demo.student;

import com.example.school_backend_demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositry extends JpaRepository<Student, Long> { }
