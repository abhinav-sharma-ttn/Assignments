package ques5;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void printMessage() {
        System.out.println("Singleton object!");
    }
}

