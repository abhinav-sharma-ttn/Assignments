/*
      3) Use Synchronize method and synchronize block to enable synchronization between multiple threads
       trying to access method at same time.
 */
package ques_3;

public class Main {

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 800; i++) {
                c.increase();
                c.add(5);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 800; i++) {
                    c.increase();
                    c.add(6);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Total calls are   " + c.count);
        System.out.println("Total sum is   " + c.sum);

        System.out.println(c.li.stream().count());
    }
}
