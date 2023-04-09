package com.example.jpa.part2.assignment.controllers;

import com.example.jpa.part2.assignment.entities.Employee;
import com.example.jpa.part2.assignment.repos.EmployeeRepository;
import com.example.jpa.part2.assignment.services.DaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    DaoService daoService;

    @GetMapping(path = "/employees")
    public List<Employee> retrieveAllEmployees() {
        return daoService.retrieveAllEmployeesFromDB();
    }

//    @GetMapping(path = "/employees/particular")
//    public List<Employee> retrieveParticularEmployees() {
//        return daoService.retrieveParticularEmployeesFromDB();
//    }

    @PostMapping(path = "/employees")
    public void createEmployee(@RequestBody Employee employee) {
        daoService.saveEmployeeInDB(employee);
    }
}
