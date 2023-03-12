package ques_3.all_interfaces;

public interface Parent {
    default void display() {
        System.out.println("Parent display called");
    }
}
