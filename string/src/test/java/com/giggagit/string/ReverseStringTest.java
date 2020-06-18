package com.giggagit.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for ReverseString.
 */
public class ReverseStringTest {

	ReverseString reverseString;

	@BeforeEach
	public void setup() {
		reverseString = new ReverseString();
	}

	@Test
	public void reverseWithArray() {
		String input = "Hello";
		String result = reverseString.reverseWithArray(input);
		assertEquals("olleH", result);
	}

	@Test
	public void reverseWithStack() {
		String input = "Hello";
		String result = reverseString.reverseWithStack(input);
		assertEquals("olleH", result);
	}

}