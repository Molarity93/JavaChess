package chapter6;

import java.util.*;

public class Homework6_3 {

	public static int reverse(int number) {
		int result = 0;
		while (number != 0) {
			int remainder = number % 10;
			result = result * 10 + remainder;
			number /= 10;
		}
		return result;
	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("Watch your number reverse itself: ");
		System.out.println(reverse(number));
		System.out.println("Your number a Palindrome?");
		System.out.println(isPalindrome(number));
		input.close();
	}

}
/*
Enter an integer: 
1234321
Watch your number reverse itself: 
1234321
Your number a Palindrome?
true
*/