/*
     Q2. Create and access default and static method of an interface.

 */

package ques_2;

public class Main implements DummyInterface {
    public static void main(String[] args) {
        Main obj = new Main();

        // accessing static method
        DummyInterface.display();

        // accessing default method
        obj.print();
    }

    @Override
    public void show() {
        System.out.println("show method");
    }
}
