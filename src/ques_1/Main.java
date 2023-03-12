/*
     Demonstrate the use of private methods in interfaces
 */

package ques_1;

public class Main implements Greeting {
    public static void main(String[] args) {
        Greeting greeting = new Main();
        greeting.printString("Hello Good morning");
    }
}
