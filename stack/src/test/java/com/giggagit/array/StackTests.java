package com.giggagit.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for Stack.
 */
public class StackTests {
 
    @Test
    public void push() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.getStack()[0]);
    }

    @Test
    public void popExist() {
        Stack stack = new Stack();

        stack.push(8);
        stack.push(3);

        assertEquals(2, stack.getTop());
        assertEquals(3, stack.pop());
        assertEquals(1, stack.getTop());
        assertEquals(8, stack.pop());
        assertEquals(0, stack.getTop());
    }

    @Test
    public void popEmpty() {
        Stack stack = new Stack();
        assertEquals(0, stack.pop());
    }

    @Test
    public void peek() {
        Stack stack = new Stack();

        stack.push(4);
        stack.push(2);
        stack.push(7);

        assertEquals(7, stack.peek());
        assertEquals(3, stack.getTop());
    }

    @Test
    public void isFull() {
        Stack stack = new Stack();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        assertEquals(true, stack.isFull());
    }

    @Test
    public void isFullNotFull() {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        assertEquals(false, stack.isFull());
    }

    @Test
    public void isEmpty() {
        Stack stack = new Stack();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void isEmptyNotEmpty() {
        Stack stack = new Stack();

        stack.push(0);
        stack.push(1);

        assertEquals(false, stack.isFull());
    }

}
