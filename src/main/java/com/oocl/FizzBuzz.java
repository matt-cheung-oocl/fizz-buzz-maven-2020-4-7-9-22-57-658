package com.oocl;

public class FizzBuzz {

	public String say(int number) {
		if (number % 3 == 0 && number % 5 == 0)
			return "FizzBuzz";

		if (number % 3 == 0)
			return "Fizz";

		if (number % 5 == 0)
			return "Buzz";
		return String.valueOf(number);
	}

	public void startGame(int numberOfStudent) {
		for (int count = 1; count <= numberOfStudent; count++) {
			System.out.println(say(count));
		}
	}
}
