/*
     Write a program to demonstrate Loosely Coupled code.
*/

package ques_2;

import org.springframework.boot.SpringApplication;

public class AssignmentApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication2.class, args);

        Person person = new Person(1, 30, "Raman", new Sedan());
        System.out.println("Person name : " + person.getName());
        System.out.println("ID : " + person.getId());
        System.out.println("Age : " + person.getAge());
        System.out.println("Car : " + person.getCar().typeOfCar());
    }
}
