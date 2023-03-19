package ques_3;

import ques_5.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleCache {

    public static void main(String[] args) {
        Thread t1 = new ques_5.Test("Abhinav", 22);
        Thread t2 = new ques_5.Test("Sharma", 23);
        Thread t3 = new ques_5.Test("PQR", 22);
        Thread t4 = new ques_5.Test("XYZ", 23);
        Thread t5 = new Test("ABC", 24);


        ExecutorService ex = Executors.newSingleThreadExecutor();
        ex.execute(t1);
        ex.execute(t2);
        ex.execute(t3);
        ex.execute(t4);
        ex.execute(t5);
    }
}


