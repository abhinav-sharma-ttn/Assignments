package ques_3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    int count = 0;
    int sum = 0;
    List<Integer> li = new ArrayList<>();

    public synchronized void increase() {
        count++;
    }

    public void add(int a) {
        li.add(a);
        synchronized (this) {
            sum += a;
        }
    }
}

