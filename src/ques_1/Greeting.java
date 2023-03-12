package ques_1;

public interface Greeting {

    private void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String ans = sb.reverse().toString();
        System.out.println("Inside Private method");
        System.out.println("Reversed String : " + ans);
    }

    default void printString(String str) {
        System.out.println("String : " + str);
        reverseString(str);
    }
}
