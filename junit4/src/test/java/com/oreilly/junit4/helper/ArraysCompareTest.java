package com.oreilly.junit4.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_randomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);

		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_nullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 0; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}

	}

}
