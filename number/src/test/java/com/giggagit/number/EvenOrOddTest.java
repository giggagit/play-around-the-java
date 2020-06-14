package com.giggagit.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for EvenOrOdd.
 */
public class EvenOrOddTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void EvenOrOddResult() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        boolean result1 = evenOrOdd.result(6);
        assertEquals(true, result1);
    }
}
