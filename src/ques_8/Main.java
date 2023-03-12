/*
      Demonstrate the use AutoCloseable
 */

package ques_8;

public class Main {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();


        try(r2; r1) {
            r1.show();
            r2.show();

        }
        catch(ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
