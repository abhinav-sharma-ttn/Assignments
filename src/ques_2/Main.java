/*
     2) Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock
     using reentract lock.
 */

package ques_2;

public class Main {

    public static void main(String[] args) {
        Bank b = new Bank(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalnace(100);
                b.withdraw(20);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalnace(100);
                b.withdraw(20);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalnace(100);
                b.withdraw(20);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}

