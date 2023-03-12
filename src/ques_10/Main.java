/*
     Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent,
     translateEscapes, formatted String methods.
 */

package ques_10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String str = "Abhinav Sharma.";
//        System.out.println("Originally : " + str);
//
//        str = str.indent(10);
//        System.out.println("After adding spaces : " + str);
//
//        str = str.indent(-5);
//        System.out.println("After removing spaces : " + str);

        System.out.println("strip : " + str.strip());
        System.out.println("1. %s, 2. %s, 3. %s".formatted("One", "Two", "Three"));

    }
}
