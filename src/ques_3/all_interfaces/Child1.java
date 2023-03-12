package ques_3.all_interfaces;

public interface Child1 extends Parent {
    default void display() {
        Parent.super.display();
        System.out.println("child1 display called");
    }
}
