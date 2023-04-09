package com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends Person {
    private int marks;

    public Student() {
    }

    public Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
