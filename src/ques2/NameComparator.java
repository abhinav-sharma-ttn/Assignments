package ques2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        int x = e1.getFirstName().compareTo(e2.getFirstName());
        return x;
    }
}
