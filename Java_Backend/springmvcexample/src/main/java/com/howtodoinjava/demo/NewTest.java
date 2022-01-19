package com.howtodoinjava.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NewTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("Inside test");
		assertTrue(true);
	}
	
	@Test
	public void test1() {
//		fail("Not yet implemented");
		System.out.println("Inside test1");
		assertTrue(true);
	}

}
