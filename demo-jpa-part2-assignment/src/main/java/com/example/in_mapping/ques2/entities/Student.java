package com.example.in_mapping.ques2.entities;

import jakarta.persistence.Entity;

@Entity
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
