package com.oreilly.junit5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {

	@BeforeEach // in JUnit 4 was called @Before
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for " + info.getDisplayName());
	}

	@AfterEach // in JUnit 4 was called @After
	void afterEach(TestInfo info) {
		System.out.println("Clean test data for " + info.getDisplayName());
	}

	// You can call the method whatever you want, as long as it is annotated with
	// @Test, it is a test
	@Test
	void lengthBasic() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;

		assertEquals(expectedLength, actualLength);

		// Assert that length is 4
		// Write test code
		// Invoke method - ex: square(4) => this is called CUT - Code Under Test
		// Checks in place - ex: 16 => checks are called ASSERTIONS
	}

	@Test
	void toUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertNotNull(result);
		// assertNull(result);
		assertEquals("ABCD", result);
	}

	@Test
	void containsBasic() {
//		String str = "abcdefgh";
//		boolean result = str.contains("ijk");
		// assertEquals(false, result);
//		assertFalse(result);

		assertFalse("abcdefgh".contains("ijk"));
	}

	@Test
	void splitBasic() {
		String str = "abc def ghi";
		String[] result = str.split(" ");

		String[] expectedResult = new String[] { "abc", "def", "ghi" };

		assertArrayEquals(expectedResult, result);
	}

}
