package ques_4;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;


public class Random implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int x = ThreadLocalRandom.current().nextInt();// used to get random value.
        return x;
    }
}

