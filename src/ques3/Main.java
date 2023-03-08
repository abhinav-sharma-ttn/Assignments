/*
     Write a program to count number of occurrences of a word in a file.
     The file name and word should be supplied through commandline.
 */

package ques3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File file = new File("/home/abhina/word.txt");
        try (FileWriter fr = new FileWriter(file, true)) {
            while (true) {
                System.out.println("Enter lines to add in the file : ");
                String line = sc.nextLine();

                fr.write(line + "\n");


                System.out.println("Do you want to enter more text,if 'NO' then write 'QUIT' otherwise click " +
                        "enter");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

        // finding the word count now.

        System.out.println("Enter the word you want to count : ");
        String s1;
        int count = 0;

        String letter = sc.nextLine();

        try {
            FileReader fr1 = new FileReader(file);
            BufferedReader br = new BufferedReader(fr1);
            while ((s1 = br.readLine()) != null) {
                String[] content = s1.split(" ");

                for (String s : content) {
                    if (s.equalsIgnoreCase(letter))
                        count++;
                }
            }
            fr1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (count == 0)
            System.out.println("Given word is not present in the file");
        else
            System.out.println("Word freq is : " + count);
    }
}
