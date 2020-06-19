package chapter2;

import java.util.*;

public class Homework2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between  0 and 1000: ");
		int number = input.nextInt();
		int firstDigit = number % 10;
		int remainNumber = number / 10;
		int secondDigit = remainNumber % 10;
		remainNumber /= 10;
		int thirdDigit = remainNumber % 10;
		int sumDigits = thirdDigit + secondDigit + firstDigit;
		System.out.println("The sum of the digits is " + sumDigits);
		input.close();

	}

}
/*

Enter a number between  0 and 1000: 999
The sum of the digits is 27
 
 */

