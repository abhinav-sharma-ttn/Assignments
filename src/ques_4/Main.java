/*
      Use iterator stream method to generate a stream
 */

package ques_4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i<=10, i -> i+2)
                .forEach(System.out :: println);
    }
}
