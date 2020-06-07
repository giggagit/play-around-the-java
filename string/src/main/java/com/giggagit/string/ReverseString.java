package com.giggagit.string;

/**
 * ReverseString
 */
public class ReverseString {

    private String result = "";

    public String reverse(String input) {
        String[] splitInput = input.split("");
        
        for (int i = splitInput.length; i > 0; i--) {
            result += splitInput[i-1];
        }

        return result;
    }

}