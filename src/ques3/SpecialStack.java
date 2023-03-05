package ques3;

import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void pushElement(int x) {
        if(stack1.size() == 0) {
            stack1.push(x);
            minStack.push(x);
        }
        else {
            stack1.push(x);
            if(x <= minStack.peek())
                minStack.push(x);
        }
    }

    public int popElement() {
        if(stack1.isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;   // to indicate stack is empty
        }
        int topElement = stack1.peek();
        stack1.pop();
        if(topElement == minStack.peek())
            minStack.pop();
        return topElement;
    }

    int topElement() {
        if(minStack.size() == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack1.peek();
    }

    public boolean isEmpty() {
        return (stack1.size() == 0);
    }

    public int getMin() {
        if(minStack.size() == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return minStack.peek();
    }
}
