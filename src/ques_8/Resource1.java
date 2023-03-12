package ques_8;

public class Resource1 implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Resource1 close method");
    }
    public void show() {
        System.out.println("Resource1 show method");
    }
}
