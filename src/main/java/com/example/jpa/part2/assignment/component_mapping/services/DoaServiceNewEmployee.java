package com.example.jpa.part2.assignment.component_mapping.services;

import com.example.jpa.part2.assignment.component_mapping.entities.NewEmployee;
import com.example.jpa.part2.assignment.component_mapping.repos.NewEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoaServiceNewEmployee {

    @Autowired
    NewEmployeeRepository newEmployeeRepository;
    public void saveEmployeeInDB(NewEmployee employee) {
        newEmployeeRepository.save(employee);
    }
}
