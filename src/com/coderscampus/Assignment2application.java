package com.coderscampus;

import java.util.Random;

import java.util.Scanner;

public class Assignment2application {

	public static void main(String[] args) {
		
		//Generate random number for player to guess (don't tell player)	
		Random random = new Random();
		
		int theRandomNumber1 = random.nextInt(100) + 1;//Generation of a random number between 1-100
			
		int attempts = 5;
		
		Scanner scanner = new Scanner(System.in);
	
//		System.out.println("Pick a number between 1-100 ");
	
		while (attempts > 0) {
			System.out.println("Pick a number between 1-100 ");
			int guess = scanner.nextInt();
			
			if (guess < 1 || guess > 100) {
				System.out.println("“Your guess is not between 1 and 100, please try again");
				continue;
			}
			
			if (guess < theRandomNumber1) {
				System.out.println("Please pick a higher number");
			}
			
			else if (guess > theRandomNumber1) {
				System.out.println("Please pick a lower number");
			}
			
			else {
				System.out.println("You Win!!");
				scanner.close();
				return;
			}

			attempts--;
			System.out.println("you have " + attempts + " attempts left.");
		}

		System.out.println("You lose, the number to guess was " + theRandomNumber1);
		scanner.close();
	
	}

}
