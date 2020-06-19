package chapter3;

import java.util.*;

public class Homework3_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of the package in pounds: ");
		double weight = input.nextDouble();

		if (weight <= 0)
			System.out.println("You entered an invalid weight in pounds!");

		else if (weight <= 1)
			System.out.println("Your shipping cost is $3.5");

		else if (weight <= 3)
			System.out.println("Your shipping cost is $5.5");

		else if (weight <= 10)
			System.out.println("Your shipping cost is $8.5");

		else if (weight <= 20)
			System.out.println("Your shipping cost is $10.5");

		else
			System.out.println("The package cannot be shipped.");

		input.close();

	}

}

/*
 * 
 * Enter the weight of the package in pounds: 0 You entered an invalid weight in
 * pounds!
 * 
 * Enter the weight of the package in pounds: 20.1 The package cannot be
 * shipped.
 * 
 * Enter the weight of the package in pounds: 5 Your shipping cost is $8.5
 * 
 */


