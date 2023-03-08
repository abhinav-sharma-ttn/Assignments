/*
      Write a program to show application of Singleton Design Pattern.
 */

package ques5;

public class Main {
    public static void main(String[] args) {

        Singleton object = Singleton.getInstance();
        object.printMessage();
    }
}
