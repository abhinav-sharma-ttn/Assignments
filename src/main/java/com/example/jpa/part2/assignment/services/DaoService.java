package com.example.jpa.part2.assignment.services;

import com.example.jpa.part2.assignment.entities.Employee;
import com.example.jpa.part2.assignment.repos.EmployeeRepository;
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

    public List<Employee> retrieveAllEmployeesFromDB() {
        return employeeRepository.findAllEmployees();
    }

    public List<Object[]> retrieveParticularEmployeesFromDB() {
        return employeeRepository.findFirstAndLastNameOfEmployeesSalaryMoreThanAvg();
    }

    public List<Object[]> retrieveAllEmployeesWithLastNameSinghFromDB(String lastName) {
        return employeeRepository.findAllEmployeesWithLastNameSingh(lastName);
    }

    public void deleteEmployeeWhoseAgeIsMoreThan45FromDB(int age) {
         employeeRepository.deleteEmployeeWhoseAgeIsMoreThan45(age);
    }

    public void deleteEmployeeWithMinSalaryFromDB() {
         employeeRepository.deleteEmployeeWithMinSalary();
    }
}
