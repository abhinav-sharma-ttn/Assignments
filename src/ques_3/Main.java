/*
      Q3. Sum all the numbers greater than 5 in the integer list using streams
 */

package ques_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 6, 8, 45, 6, 8, 6, 89, 23);
        int sum = list.stream()
                .filter(a -> a > 5)
                .reduce(0, (a, b) -> a+b);
        System.out.println("Sum : " + sum);
    }
}
