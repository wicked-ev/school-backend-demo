package com.example.school_backend_demo.student;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepositry repositry;

    StudentController(StudentRepositry repositry) {
        this.repositry = repositry;
    }

    @GetMapping("/students")
    List<Student> all() {
        return repositry.findAll();
    }

    @GetMapping("/student/{id}")
    Student one(@PathVariable Long id ) {
        return repositry.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }
    @PostMapping("/students")
    Student newStudent(@RequestBody Student newStudent) {
        return  repositry.save(newStudent);
    }

    @PutMapping("/students/{id}")
    Student replaceStudent(@RequestBody Student newStudent, @PathVariable Long id) {
        return repositry.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setLastName(newStudent.getLastName());
                    student.setAge(newStudent.getAge());
                    student.setLevel(newStudent.getLevel());
                    student.setSpecialization(newStudent.getSpecialization());
                    return repositry.save(student);
                }).orElseGet(() -> {
                    return repositry.save(newStudent);
                });
    }

    @DeleteMapping("/student/{id}")
    void deleteStudent(@PathVariable Long id) {
        repositry.deleteById(id);
    }

}
