/*
      4) Write a code to simulate a deadlock in java
 */

package ques_4;

public class Main {
    public static void main(String[] args) {
        String s1 = "Abhinav";
        String s2 = "Sharma";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1) {
                    System.out.println(Thread.currentThread().getName() + " " + "have Abhinav");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + " " + "have Sharma");
                    }
                }
            }

            ;
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName() + " " + "have Abhinav");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName() + " " + "have Sharma");
                    }
                }
            }

            ;
        });
        t1.start();
        t2.start();
    }
}

