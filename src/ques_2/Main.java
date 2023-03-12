/*
     Perform takeWhile and dropWhile operations on stream
 */

package ques_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("takeWhile");
        list.stream()
                .takeWhile(x -> x < 6)
                .forEach(System.out :: println);

        System.out.println("dropWhile");
        list.stream()
                .dropWhile(x -> x < 6)
                .forEach(System.out :: println);
    }
}
