package com.example.springboot.assign.demo.springboot.assignw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    @Autowired
    private EmployeeDao employeeDaoService;

    @GetMapping(path = "/employees")
    public ArrayList<Employee> retrieveEmployee() {
        return employeeArrayList;
    }

    @PostMapping(path = "/employees")
    public void saveEmployeeInList(@RequestBody Employee employee) {
        employeeArrayList.add(employee);
        employeeDaoService.save(employee);
    }
}
