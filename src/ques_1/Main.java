/*
     1) Create and Run a Thread using Runnable Interface and Thread class and show usage of
     sleep and join methods in the created threads.
 */

package ques_1;

public class Main {
    public static void main(String[] args) throws Exception {
        // using Anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable is running");

                    try {
                        Thread.sleep(2500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        MyThread t1 = new MyThread();
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println("This line executed after  t1 end");
        System.out.println("This line executed after t2 end");

    }
}

