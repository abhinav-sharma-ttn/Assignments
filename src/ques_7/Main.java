/*
      Use Of method to create List, Set and Map
 */

package ques_7;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list);

        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(set);

        Map<String, Integer> map = Map.of("Abhinav", 10, "XYZ", 20, "Java", 30, "C++", 40);
        System.out.println(map);
    }
}
