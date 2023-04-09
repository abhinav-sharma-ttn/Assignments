package com.example.jpa.part2.assignment.inheritance_mapping.single_table.services;

import com.example.jpa.part2.assignment.inheritance_mapping.single_table.entities.Teacher;
import com.example.jpa.part2.assignment.inheritance_mapping.single_table.repos.PersonRepository;
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
