package com.giggagit.array;

/**
 * Stack
 */
public class Stack {

    private final int max = 10;
    private int top;
    private int[] stack = new int[max];

    public void push(int object) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stack[top] = object;
            ++top;
        }
    }

    public int pop() {
        int pop;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            pop = 0;
        } else {
            pop = stack[top-1];
            stack[top-1] = 0;
            --top;
        }

        return pop;
    }

    public int peek() {
        return stack[top-1];
    }

    public boolean isFull() {
        if (top >= max) {
            return true;
        }

        return false;
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        }

        return false;
    }

    public int getMax() {
        return max;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

}