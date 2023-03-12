/*
       Use rangeClosed to create a  Stream
 */

package ques_3;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(System.out :: println);
    }
}
