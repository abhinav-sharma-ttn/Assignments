/*
     Write a program to implement constructor reference
 */

package ques_4;

import ques_4.classes.DummyClass;
import ques_4.interfaces.Dummy;

public class Main {
    public static void main(String[] args) {

        Dummy d = DummyClass::new;
        d.show();
    }
}

