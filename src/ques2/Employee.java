package ques2;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String firstName, lastName;
    private Double age, salary;

    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    // getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String toString() {
        return (firstName + " " + lastName + ", " + age + ", " + salary);
    }

    @Override
    public int compareTo(Employee o) {
        return this.firstName.compareTo(o.getFirstName());
    }
}
