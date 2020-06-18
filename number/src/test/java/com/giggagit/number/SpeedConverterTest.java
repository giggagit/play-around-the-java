package com.giggagit.number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * SpeedConverterTest
 */
class SpeedConverterTest {

	@Test
	public void speedConverterTestOne() {
		assertEquals(1, SpeedConverter.toMilesPerHour(1.5));
	}

	@Test
	public void speedConverterTestTwo() {
		assertEquals(6, SpeedConverter.toMilesPerHour(10.25));
	}

	@Test
	public void speedConverterTestTree() {
		assertEquals(-1, SpeedConverter.toMilesPerHour(-5.6));
	}

	@Test
	public void speedConverterTestFour() {
		assertEquals(16, SpeedConverter.toMilesPerHour(25.42));
	}

	@Test
	public void speedConverterTestFive() {
		assertEquals(47, SpeedConverter.toMilesPerHour(75.114));
	}

}
