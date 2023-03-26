/*
     Write a program to demonstrate Tightly Coupled code.
*/

package ques_1;

import org.springframework.boot.SpringApplication;

public class AssignmentApplication1 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Verna", 12);
        Person person = new Person(1, 30, "Raman", sedan);
        SpringApplication.run(AssignmentApplication1.class, args);
        System.out.println(person);
    }
}
