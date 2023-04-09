package com.example.in_mapping.ques2.entities;


import jakarta.persistence.Entity;

@Entity
public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
