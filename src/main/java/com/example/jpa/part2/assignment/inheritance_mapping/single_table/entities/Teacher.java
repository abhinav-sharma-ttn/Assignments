package com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("teacher")
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
