package com.giggagit.string;

import java.util.Stack;

/**
 * ReverseString
 */
public class ReverseString {

	private String result = "";

	public String reverseWithArray(String input) {
		String[] splitInput = input.split("");

		for (int i = splitInput.length; i > 0; i--) {
			result += splitInput[i - 1];
		}

		return result;
	}

	public String reverseWithStack(String input) {
		char[] c = input.toCharArray();
		int size = c.length;
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < size; i++) {
			stack.push(c[i]);
		}

		for (int i = 0; i < size; i++) {
			result += stack.pop();
		}

		return result;
	}

}