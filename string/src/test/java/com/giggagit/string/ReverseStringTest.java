package com.giggagit.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for ReverseString.
 */
public class ReverseStringTest {

    @Test
    public void reverse() {
        String input = "Hello";
        ReverseString reverseString = new ReverseString();
        String result = reverseString.reverse(input);
        assertEquals("olleH", result);
    }

}