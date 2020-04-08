package com.oocl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	@Test
	public void should_return_normal_num() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals("1", fizzBuzz.say(1));
	}

	@Test
	public void should_return_Fizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals("Fizz", fizzBuzz.say(3));
	}
}
