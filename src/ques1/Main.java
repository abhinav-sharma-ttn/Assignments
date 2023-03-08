/*
     Write a program to display values of enums using a constructor & getPrice()
     method (Example display house & their prices)
*/

package ques1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose house type : ");
        System.out.println("1. Flat");
        System.out.println("2. Vila");
        System.out.println("Enter a house type (name of house type) : ");
        String input = sc.nextLine();
        String house = input.toUpperCase();
        System.out.print("Cost of " + house + " is : Rs ");

        if (house.equals("FLAT")) {
            EnumHouse.House flat = EnumHouse.House.FLAT;
            System.out.println(flat.getPrice());
        } else if (house.equals("VILA")) {
            EnumHouse.House vila = EnumHouse.House.VILA;
            System.out.println(vila.getPrice());
        } else {
            System.out.println("You entered wrong option.");
        }
    }
}