package ques2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        Double e1Salary = e1.getSalary(), e2Salary = e2.getSalary();
        if(e1Salary == e2Salary) {
            return 0;
        }
        else if(e1Salary > e2Salary) {
            return 1;
        }
        return -1;
    }
}
