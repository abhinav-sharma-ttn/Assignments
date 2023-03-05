/*
     WAP showing try, multi-catch and finally blocks.
 */

package ques2;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size for 1st and 2nd array : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int []arr1 = new int[n1];
        int []arr2 = new int[n2];

        System.out.println("Enter Elements for 1st array : ");
        for(int i=0; i<=n1-1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Elements for 2nd array : ");
        for(int i=0; i<=n2-1; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter index1 and index2 : ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        // performing division on arr1[index1] and arr2[index2]
        try {
            double ans = (arr1[index1]*1.0) / arr2[index2];
            System.out.println("Ans : " + ans);
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
        catch(Exception e) {
            System.out.println("Message : " + e.getMessage());
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
