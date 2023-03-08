/*
      Create a User class with fields:  firstname, lastname, age, phonenumber.
      Write a program which accepts values of user fields from commandline,
      create object and append that to a text file. After every user creation
      the program should prompt: "Do you want to continue creating users? (Type QUIT to exit)"
      and keep on accepting values and writing to file unitl user quits.
 */

package ques2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter("/home/abhina/users.txt", true);
            while (true) {
                System.out.print("Enter first name: ");
                String firstname = sc.nextLine();

                System.out.print("Enter last name: ");
                String lastname = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter phone number: ");
                String phoneNumber = sc.nextLine();
                User user = new User(firstname, lastname, phoneNumber, age);

                fileWriter.write(user + "\n");


                System.out.print("Do you want to continue?");
                System.out.println("(Type 'Q' to exit) or, (Press Enter to add more) : ");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("Q")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
