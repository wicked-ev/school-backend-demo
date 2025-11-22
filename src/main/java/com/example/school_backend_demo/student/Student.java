package com.example.school_backend_demo.student;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Student {
    private @Id
    @GeneratedValue Long id;

    private String name;
    private String lastName;
    private int age;

    private String level;

    private String specialization;

    Student() {}

    public Student(String name, String lastName, int age, String level, String specialization) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.level = level;
        this.specialization = specialization;

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student)) return false;

        Student studnet = (Student) o;

        return  Objects.equals(this.id, studnet.id) &&
                Objects.equals(this.name, studnet.name) &&
                Objects.equals(this.age, studnet.age) &&
                Objects.equals(this.level, studnet.level) &&
                Objects.equals(this.specialization, this.specialization);

    }

    @Override
    public int hashCode () {
        return Objects.hash(this.id, this.name, this.level, this.specialization);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", lastName='" + this.lastName + '\'' +  ", level='" + this.level + '\'' + ", specialization='" + this.specialization + '\'' + '}';
    }
}
