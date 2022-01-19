package com.howtodoinjava.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyFirstTest {

	int age=19;
	
	@Before
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		
		String str="namratha";
		int i=5;
		String str1 = "amrutha";
//		assertTrue(i>2);
//		assertFalse(i>20);
//		assertNull(str);
		assertEquals(str, str1);
	}

}
