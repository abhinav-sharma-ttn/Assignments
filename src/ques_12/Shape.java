package ques_12;

sealed class Shape
       permits Square, Circle {
    public void show() {
        System.out.println("Shape class show method");

    }
}

