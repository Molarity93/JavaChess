package chapter2;

import java.util.*;

public class Homework2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double Celsius = input.nextDouble();
		double Fahrenheit = (9.0 / 5) * Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit.");
		input.close();
	}

}
/*
 
 Enter a degree in Celsius: 43 
 43.0 Celsius is 109.4 Fahrenheit.

 */

