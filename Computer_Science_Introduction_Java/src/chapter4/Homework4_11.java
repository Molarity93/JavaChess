package chapter4;

import java.util.*;

public class Homework4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();

		input.close();

		if (decimal >= 10 && decimal <= 15) {
			int value = ('A' + decimal - 10);
			System.out.println("The hex value is " + (char) value);
			return;
		}

		else if (decimal >= 0 && decimal <= 10) {
			System.out.println("The hex value is " + decimal);
			return;
		}

		else {
			System.out.println(decimal + " is an invalid input.");
			return;
		}

	}

}
/*
* Enter a decimal value (0 to 15): 11 The hex value is B
* 
* Enter a decimal value (0 to 15): 5 The hex value is 5
* 
* Enter a decimal value (0 to 15): 31 31 is an invalid input.
* 
*/
