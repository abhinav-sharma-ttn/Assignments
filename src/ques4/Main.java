/*
    Create a custom exception that do not have any stack trace.
 */

package ques4;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCustomExcetion("Custom Exception Demo");
        }
        catch (MyCustomExcetion e) {
            System.out.println("Exception : " + e.getMessage());
        }
        finally {
            System.out.println("Inside Finally");
        }
    }
}
