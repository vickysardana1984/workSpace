package com.examples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest1 {
	private Math math = new Math();

	@Test
	public void testSum() {
		int result = math.sum(1, 3);
		assertEquals(4, result);

	}

}
