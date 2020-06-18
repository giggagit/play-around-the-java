package com.giggagit.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * DecimalComparatorTest
 */
public class DecimalComparatorTest {

    @Test
    public void areEqualByThreeDecimalPlacesOne() {
        assertEquals(true, DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    @Test
    public void areEqualByThreeDecimalPlacesTwo() {
        assertEquals(false, DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    @Test
    public void areEqualByThreeDecimalPlacesTree() {
        assertEquals(true, DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    @Test
    public void areEqualByThreeDecimalPlacesFour() {
        assertEquals(false, DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

}