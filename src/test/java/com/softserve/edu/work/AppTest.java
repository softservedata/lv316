package com.softserve.edu.work;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testApp1() {
		System.out.println("@Test testApp1()");
		double expected = 3.1;
		double actual = 1.0 + 2.1;
		Assert.assertEquals(actual, expected, 0.001);
	}

	@Test
	public void testApp2() {
		System.out.println("@Test testApp2()");
		double expected = 3.0;
		double actual = 1.0 + 2.0;
		Assert.assertEquals(actual, expected, 0.001);
	}

}
