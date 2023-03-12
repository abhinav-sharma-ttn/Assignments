package ques_3.all_interfaces;

import ques_3.all_interfaces.Child1;
import ques_3.all_interfaces.Child2;

public class DefaultMethods implements Child1, Child2 {
        public void display() {
            Child1.super.display();
            Child2.super.display();
            System.out.println("DefaultMethods called" );
        }
}
