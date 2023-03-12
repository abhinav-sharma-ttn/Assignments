/*
       Write the following a functional interface and implement it using
       lambda:

To check whether the first number is greater than second number or not,
Parameter (int ,int ) Return type boolean
Increment the number by 1 and return incremented value Parameter (int)
Return int
Concatination of 2 string Parameter (String , String ) Return (String)
Convert a string to uppercase and return . Parameter (String)
Return (String)
 */

package ques_1;

import ques_1.all_interfaces.Compare2Number;
import ques_1.all_interfaces.Concat;
import ques_1.all_interfaces.Increment;
import ques_1.all_interfaces.ToUpperCase;

public class Main {
    public static void main(String[] args) {

        String s1 = "Abhinav";
        String s2 = "Sharma";
        Concat concat = (a, b) -> a + b;
        System.out.println("String are : " + s1 + ", " + s2);
        System.out.println("After Concatenating : " + concat.concatStrings(s1, s2));
        System.out.println("");

        int n1 = 10, n2 = 3;
        Compare2Number c = (a, b) -> a > b;
        System.out.println(c.checkingNumber(n1, n2));
        System.out.println("");

        int num1 = 10;
        Increment increment = a ->  a+1;
        System.out.println("Original num : " + num1);
        System.out.println("After increment : " + increment.increaseNumberByOne(num1));
        System.out.println("");

        String str = "abhinav";
        ToUpperCase toUpperCase = a -> a.toUpperCase();
        System.out.println("Original String : " + str);
        System.out.println("After : " + toUpperCase.convertToUppercase(str));
    }
}
