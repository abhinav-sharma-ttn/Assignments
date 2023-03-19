/*
      4) WAP to return a random integert value from a thread execution using Future.
 */
package ques_4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        Future<Integer> future;
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            future = ex.submit(new Random());
            list.add(future);
        }
        for (Future x : list) {
            try {
                System.out.println(x.get());
            } catch (Exception e) {
                System.out.println("Interruption occur");
                e.printStackTrace();
            }

        }
    }
}
