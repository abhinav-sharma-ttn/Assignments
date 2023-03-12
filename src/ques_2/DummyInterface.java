package ques_2;

public interface DummyInterface {
    void show();
    default void print() {
        System.out.println("Hello, inside default method");
    }
    static void display() {
        System.out.println("Inside static method");
    }
}
