package com.example.restful.webservice.assign.employee;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoService daoService;

    public EmployeeController(EmployeeDaoService daoService) {
        this.daoService = daoService;
    }

    // to get all employees
    @GetMapping(path = "/employees")
    public ArrayList<Employee> retrieveAllEmployees() {
        return daoService.getEmployeeList();
    }

    // to get a specific employee based on ID
    @GetMapping(path = "/employees/{id}")
    public Employee retrieveSpecificEmployee(@PathVariable int id) {
        return daoService.getSpecificEmployee(id);
    }

    // to add a employee
    @PostMapping(path = "/employees")
    public void addEmployee(@Valid @RequestBody Employee employee) {
        daoService.saveEmployeeInList(employee);
    }

    // to delete an employee
    @DeleteMapping(path = "/employees/{id}")
    public void deleteEmployee(int id) {
        daoService.deleteEmployeeFromList(id);
    }

    @PutMapping(path = "/employees")
    public void updateEmployee(@RequestBody Employee employee) {
        daoService.updateEmployeeInList(employee);
    }
}
