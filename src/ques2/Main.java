/*
    2) Given the following class
       Employee class{ Double Age; Double Salary; String Name}
       Design the class in such a way that the default sorting should work on firstname
       and lastname.
       Also, Write a program to sort Employee objects based on salary using Comparator.
*/

package ques2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeAL = new ArrayList<Employee>();
        employeeAL.add(new Employee("Abhinav", "Sharma", 20.0, 2000.0));
        employeeAL.add(new Employee("XYZ", "ABC", 23.0, 3000.0));
        employeeAL.add(new Employee("Nitin", "Kumar", 24.0,1000.0));
        employeeAL.add(new Employee("Danish", "Bisht",40.0, 5000.0));


        Collections.sort(employeeAL);
        // System.out.println(employeeAL);
        int i=1;
        for(Employee emp : employeeAL) {
            System.out.println(i + ". " + emp);
            i++;
        }

        // sort as per salary
        System.out.println("Sorting acc. to Salary : ");
        Collections.sort(employeeAL, new SalaryComparator());
        i=1;
        for(Employee emp : employeeAL) {
            System.out.println(i + ". " + emp);
            i++;
        }
    }
}
