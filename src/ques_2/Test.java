package ques_2;

public class Test {
        volatile int val = 0;
        public synchronized void add(){
            val++;
            System.out.println(Thread.currentThread().getName()+" "+ val);
        }
}
