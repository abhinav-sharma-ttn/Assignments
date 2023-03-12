package ques_8;

public class Resource2 implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource2 close method");
    }

    public void show() {
        System.out.println("Resource2 show method");
    }
}
