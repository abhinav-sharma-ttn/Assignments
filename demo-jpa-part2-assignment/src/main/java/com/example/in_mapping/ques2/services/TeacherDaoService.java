package com.example.in_mapping.ques2.services;


import com.example.in_mapping.ques2.entities.Teacher;
import com.example.in_mapping.ques2.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherDaoService {
    @Autowired
    PersonRepository personRepository;

    public void saveTeacherInDB(Teacher teacher) {
        personRepository.save(teacher);
    }
}
