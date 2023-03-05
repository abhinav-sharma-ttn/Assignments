/*
   3) Design a Data Structure SpecialStack that supports all the stack operations
   like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
   which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
 */

package ques3;

public class Main {
    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();

        specialStack.pushElement(10);
        specialStack.pushElement(20);
        specialStack.pushElement(3);
        specialStack.pushElement(8);
        specialStack.pushElement(1);
        specialStack.pushElement(4);
        specialStack.pushElement(0);

        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());
        specialStack.popElement();

        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();

        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();
        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();

        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();
        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();
        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();
        System.out.println("Top : " + specialStack.topElement());
        System.out.println("Min Element : " + specialStack.getMin());

        specialStack.popElement();
    }
}
