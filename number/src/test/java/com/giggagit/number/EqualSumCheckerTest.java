package com.giggagit.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EqualSumCheckerTest
 */
public class EqualSumCheckerTest {

    @Test
    public void hasEqualSumOne() {
        assertEquals(false, EqualSumChecker.hasEqualSum(1, 1, 1));
    }

    @Test
    public void hasEqualSumTwo() {
        assertEquals(true, EqualSumChecker.hasEqualSum(1, 1, 2));
    }

    @Test
    public void hasEqualSumThree() {
        assertEquals(true, EqualSumChecker.hasEqualSum(1, -1, 0));
    }

}