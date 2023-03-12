/*
      Use ifPresentOrElse, or, orElseThrow Operations with Optional
 */

package ques_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3 ,4, 5 ,6 , 7, 8, 9, 10);
        list.stream()
                .filter(x -> x >= 7)
                .findFirst()
                .ifPresentOrElse(System.out :: println,
                        () -> System.out.println("No Value exist"));
    }
}
