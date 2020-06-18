package com.giggagit.number;

/**
 * DecimalComparator
 */
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int volumeOne = (int) (one * 1000);
        int volumeTwo = (int) (two * 1000);

        if (volumeOne == volumeTwo) {
            return true;
        }

        return false;
    }

}