package com.example.in_mapping.ques2.services;

import com.example.in_mapping.ques2.entities.Student;
import com.example.in_mapping.ques2.repos.PersonRepository;
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
