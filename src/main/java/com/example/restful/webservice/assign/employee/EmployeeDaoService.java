package com.example.restful.webservice.assign.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class EmployeeDaoService {
    private static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    private static int noOfEmployees = 0;
    static {
        employeeArrayList.add(new Employee(++noOfEmployees, "Abhinav", 40));
        employeeArrayList.add(new Employee(++noOfEmployees, "PQR", 30));
        employeeArrayList.add(new Employee(++noOfEmployees, "XYZ", 35));
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeArrayList;
    }

    public Employee getSpecificEmployee(int id) {
        Employee employee = employeeArrayList
                .stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);

        if(employee == null) {
            throw  new EmployeeNotFoundException("No such employee exist.");
        }
        return employee;
    }

    public void saveEmployeeInList(Employee employee) {
        employee.setId(++noOfEmployees);
        employeeArrayList.add(employee);
    }

    public void updateEmployeeInList(Employee employee) {
        for(int i=0; i <= employeeArrayList.size(); i++) {
            if(employeeArrayList.get(i).getId() == employee.getId()) {
               employeeArrayList.set(i, employee);
               break;
            }
        }
    }

    public void deleteEmployeeFromList(int id) {
        employeeArrayList.removeIf(emp -> emp.getId() == id);
    }
}
