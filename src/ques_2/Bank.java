package ques_2;

import java.util.concurrent.locks.ReentrantLock;

public class Bank extends Thread {
    int balance;
    private ReentrantLock lock = new ReentrantLock();// so that can be called

    public Bank(int balance) {
        this.balance = balance;
    }

    public void updateBalnace(int amount) {
        lock.lock();
        try {
            balance = balance + amount;
            System.out.println(Thread.currentThread().getName() + "  lock acquired and balance is "
                    + balance);
        } finally {
            System.out.println(Thread.currentThread().getName() + " lock released");
            lock.unlock();
        }
    }

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance < amount) {
                System.out.println("error");
                throw new IllegalArgumentException();
            } else {
                System.out.println(Thread.currentThread().getName() + " lock acquired for withdraw");
                balance = balance - amount;
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + " lock relesed and balance is " +
                    balance);
            lock.unlock();
        }
    }

}

