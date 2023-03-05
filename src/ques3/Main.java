/*
    WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
 */

package ques3;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("AbhinavSharma");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
