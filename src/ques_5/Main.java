/*
     Q5. Given a list of objects of following class:
class Employee{
    String fullName;
    Long salary;
    String city;
}
    Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
        Note: Full name is concatenation of first name, middle name and last name with single space in between.

 */

package ques_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creating employee list
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Abhinav","","Sharma",2000L,"Delhi"));
        employeeList.add(new Employee("Raj","","Malhotra",9000L,"Delhi"));
        employeeList.add(new Employee("Rahul","","Pradhan",2500L,"Delhi"));
        employeeList.add(new Employee("Raj","","Kaushal",2000L,"Noida"));
        employeeList.add(new Employee("Shubham","","Sharma",2000L,"Delhi"));
        employeeList.add(new Employee("Shubham","","Kumar",4000L,"Delhi"));
        employeeList.add(new Employee("Dinesh","","Kadian",6000L,"Delhi"));
        employeeList.add(new Employee("Ankit","","Sharma",9000L,"Kashmir"));
        employeeList.add(new Employee("Ankit","","Pal",3000L,"Delhi"));

        HashSet<String> set=new HashSet<>();
        employeeList.stream()
                .filter(e -> e.getSalary() < 5000)
                .filter(e -> e.getCity().equalsIgnoreCase("Delhi"))
                .forEach(e-> set.add(e.getFirstName()));
        set.forEach(System.out::println);
    }
}
