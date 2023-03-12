package ques_9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> unmodifiableList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(unmodifiableList);

        // it will through an exception as the list is unmodifiable.
        // unmodifiableList.add(20);
    }
}