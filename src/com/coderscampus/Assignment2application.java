package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2application {

	public static void main(String[] args) {
		// Generate random number the player will guess (don't tell the player)
		Random theRandomNumber = new Random();
		// theRandomNumber (where theRandomNumber is the actual value of the variable
		// generated at the beginning of the game.)
		theRandomNumber.nextInt(101);
		// player only gets 5 guesses.
		int attempts = 5;

		Scanner scanner = new Scanner(System.in);
		// syso "pick a random number between 1-100" player prompted " use int values
		System.out.println("Pick a number between 1-100 ");

		while (attempts > 0) {
			System.out.println("Pick a number between 1-100 ");
			int guess = scanner.nextInt();
			// number chosen is outside the suggested field error message says
			// "your guess is not between 1-100, please try again."
			if (guess < 1 || guess > 100) {
				System.out.println("“Your guess is not between 1 and 100, please try again");
				continue;
			}
			// invalid input doesn't affect the number of guesses
			// valid number guessed: 1 of these three responses
			// 1. please pick a higher number.
			if (guess < theRandomNumber) {
				System.out.println("Please pick a higher number");
			}
			// 2. please pick a lower number.
			else if (guess > theRandomNumber) {
				System.out.println("Please pick a lower number");
			}
			// 3. you win
			else {
				System.out.println("You Win!!");
				Scanner close;
				return;
			}

			attempts--;
			System.out.println("you have " + attempts + "attempts left.");
		}
		// player fails to guess number syso "you lose, the number to guess was
		System.out.println("You lose, the number to guess was " + theRandomNumber);
		Scanner close;
		// once the player fails to guess the number, or if they correctly guess the
		// number, the game is over and the application ends.

	}

}
