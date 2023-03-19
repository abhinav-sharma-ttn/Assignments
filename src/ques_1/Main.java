/*
     1) Create and Run a Thread using Runnable Interface and Thread class and show usage of
     sleep and join methods in the created threads.
 */
package ques_1;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws Exception {
        Test t1 = new Test(8);
        try {
            System.out.println(t1.call());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int x = 30;
                int y = 40;
                return x * y;
            }
        };
        Integer result = call.call();
        System.out.println(result);
    }
}
