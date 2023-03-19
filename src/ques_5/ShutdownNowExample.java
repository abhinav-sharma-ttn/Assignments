package ques_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownNowExample {

    public static void main(String[] args) {
        Thread t1 = new Test("Abhinav", 22);
        Thread t2 = new Test("Sharma", 23);
        Thread t3 = new Test("PQR", 22);
        Thread t4 = new Test("XYZ", 23);
        Thread t5 = new Test("ABC", 24);

        ExecutorService ex = Executors.newFixedThreadPool(5);
        ex.execute(t1);
        ex.execute(t2);
        ex.execute(t3);
        ex.shutdownNow();
        ex.execute(t4);
        ex.execute(t5);
    }
}

