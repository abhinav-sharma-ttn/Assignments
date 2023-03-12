/*
      Demonstrate the use of Sealed Classes.
 */

package ques_12;

public class Main {
    public static void main(String[] args) {
         Shape shape = new Shape();
        shape.show();

        Circle circle = new Circle();
        circle.show();

        Square square = new Square();
        square.show();

        SemiCircle semiCircle = new SemiCircle();
        semiCircle.show();
    }
}
