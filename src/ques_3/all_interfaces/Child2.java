package ques_3.all_interfaces;

public interface Child2 extends Parent {
    default void display() {
        System.out.println("child2 display called");
    }
}
