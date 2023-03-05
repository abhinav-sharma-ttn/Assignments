/*
   4) Create class Employee with attributes name,age,designation and use instances of
      these class as keys in a Map and their salary as value
*/

package ques4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Abhinav", 20, "Trainee");
        Employee emp2 = new Employee("Nitin", 22, "Intern");
        Employee emp3 = new Employee("Pranshu", 30, "XYZ");
        Employee emp4 = new Employee("ABC", 17, "Marketing Manage");
        Employee emp5 = new Employee("PQR", 45, "System Engineer");

        HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
        map.put(emp1, 20000);
        map.put(emp2, 18000);
        map.put(emp3, 19000);
        map.put(emp4, 25000);
        map.put(emp5, 20000);

        //System.out.println(map);
        for(Map.Entry<Employee, Integer> emp : map.entrySet()) {
            System.out.println("Employee : " + emp.getKey().getName() + ", Salary : " + emp.getValue());
        }
    }
}
