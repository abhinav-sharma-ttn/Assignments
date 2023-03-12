/*
       Implement following functional interfaces from java.util.function using lambdas:

        Consumer
        Supplier
        Predicate
        Function

 */


package ques_1;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Predicate
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = sc.nextInt();

        // checking for even or odd, using Predicate
        Predicate<Integer> p = a -> a%2 == 0;
        System.out.println("Is " + n + " even : " + p.test(n));

        // Consumer
        // i am only printing num value
        Consumer<Integer> c = a -> System.out.println("Num is : " + a);
        c.accept(n);

        // Function
        // returning square of n
        Function<Integer, Integer> f = a -> a*a;
        c.accept(n);
        System.out.println("Square : " + f.apply(n));

        // supplier
        // saying hello using Supplier
        Supplier<String> s = () -> {
          return "Hello";
        };
        System.out.println(s.get());
    }
}






