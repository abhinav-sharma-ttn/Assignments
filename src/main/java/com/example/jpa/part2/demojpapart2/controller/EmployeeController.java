package com.example.jpa.part2.demojpapart2.controller;

import com.example.jpa.part2.demojpapart2.entities.Employee;
import com.example.jpa.part2.demojpapart2.repos.EmployeeRepository;
import com.example.jpa.part2.demojpapart2.service.DaoService;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    DaoService daoService;

    //    @GetMapping(path = "/employees")
//    public ArrayList<Employee> retrieveAllEmployeeFromDB() {
//        employeeRepository.findAll();
//    }

    // save employee in DB
    @PostMapping(path = "/employees")
    public void saveEmployee(@RequestBody Employee employee) {
        daoService.saveEmployeeInDB(employee);
    }

    @GetMapping(path = "/employees")
    public List<Employee> retrieveAllEmployee() {
        List<Employee> employeeList = daoService.retrieveAllEmployeeFromDB();
        return employeeList;
    }

    @GetMapping(path = "/employee/partial")
    public List<Object[]> retrievePartialInfoOfEmployee() {
        return daoService.retrieveAllEmployeeFirstAndLastNameFromDB();
    }

    @GetMapping(path = "/employee/firstName/{firstName}")
    public List<Employee> retrieveAllEmployeeWithGivenFirstName(@PathVariable String firstName) {
        return daoService.retrieveAllEmployeeWithGivenFirstNameFromDB(firstName);
    }
}
