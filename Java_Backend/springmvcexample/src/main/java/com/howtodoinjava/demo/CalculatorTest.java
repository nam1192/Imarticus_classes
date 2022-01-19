package com.howtodoinjava.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import springmvcexample.utility.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		Calculator c= new Calculator();
		assertTrue(c.add(2, 3)==5);
	}

	@Test
	public void testSub() {
//		fail("Not yet implemented");
		Calculator d= new Calculator();
		assertTrue(d.sub(3, 2)==4);
	}

}
