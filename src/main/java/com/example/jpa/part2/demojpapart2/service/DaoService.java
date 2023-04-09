package com.example.jpa.part2.demojpapart2.service;

import com.example.jpa.part2.demojpapart2.entities.Employee;
import com.example.jpa.part2.demojpapart2.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployeeInDB(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> retrieveAllEmployeeFromDB() {
        return employeeRepository.findAllEmployee();
    }

    public List<Object[]> retrieveAllEmployeeFirstAndLastNameFromDB() {
        return employeeRepository.findFirstAndLastNameOfEmployee();
    }

    public List<Employee> retrieveAllEmployeeWithGivenFirstNameFromDB(String firstName) {
        return employeeRepository.findEmployeeWithGivenFirstName(firstName);
    }
}
