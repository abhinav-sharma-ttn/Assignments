package ques_1;

import ques_5.Test;

public class RunnableExample implements Runnable{
    /*
         Difference
         1. Runnable run method doesn't return any result, while callable call returns value
         2. Runnable run doesn't throw any exception, while Callable does
     */
    @Override
    public void run() {
        System.out.println("Inside Runnable run method");
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableExample();
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
