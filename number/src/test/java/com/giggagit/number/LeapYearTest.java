package com.giggagit.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * LeapYearTest
 */
public class LeapYearTest {

    @Test
    public void isLeapYearOne() {
        assertEquals(false, LeapYear.isLeapYear(-1600));
    }

    @Test
    public void isLeapYearTwo() {
        assertEquals(true, LeapYear.isLeapYear(1600));
    }

    @Test
    public void isLeapYearTree() {
        assertEquals(false, LeapYear.isLeapYear(2017));
    }

    @Test
    public void isLeapYearFour() {
        assertEquals(true, LeapYear.isLeapYear(2000));
    }

}