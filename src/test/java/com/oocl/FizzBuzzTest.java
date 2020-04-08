package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	@Test
	public void should_return_normal_number() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.say(1));
	}

	@Test
	public void should_return_Fizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.say(3));
	}

	@Test
	public void should_return_Buzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.say(10));
	}

	@Test
	public void should_return_FizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.say(10));
	}

	@Test
	public void simulate_game_FizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		assertEquals(("1\n" +
						"2\n" +
						"Fizz\n" +
						"4\n" +
						"Buzz\n" +
						"Fizz\n" +
						"7\n" +
						"8\n" +
						"Fizz\n" +
						"Buzz\n" +
						"11\n" +
						"Fizz\n" +
						"13\n" +
						"14\n" +
						"FizzBuzz\n" +
						"16\n" +
						"17\n" +
						"Fizz\n" +
						"19\n" +
						"Buzz\n"),
						fizzBuzz.startGame(20));
	}
}