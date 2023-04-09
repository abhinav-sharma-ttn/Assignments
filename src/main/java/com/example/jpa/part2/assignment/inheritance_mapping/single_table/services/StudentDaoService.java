package com.example.jpa.part2.assignment.inheritance_mapping.single_table.services;

import com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities.Student;
import com.example.jpa.part2.assignment.inheritance_mapping.single_table.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoService {

    @Autowired
    PersonRepository personRepository;

    public void saveStudentInDB(Student student) {
        personRepository.save(student);
    }
}
