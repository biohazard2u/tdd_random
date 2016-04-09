package com.mz.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greeting;

	@Before
	public void setUp(){
		greeting = new GreetingImpl();
	}
	
	@After
	public void tearDown(){
		greeting = null;
	}
	
	@Test
	public void greetShouldReturnAValidOutput() {
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_ForNameIsNull() {
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_ForNameIsBlank() {
		greeting.greet("");
	}
}
