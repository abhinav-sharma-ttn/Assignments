/*
       2) WAP to showcase the usage of volatile in java.
 */

package ques_2;

public class Main {

    public static void main(String[] args) {
        Test x = new Test();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                x.add();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                x.add();
        });
        t1.start();
        t2.start();

    }
}

