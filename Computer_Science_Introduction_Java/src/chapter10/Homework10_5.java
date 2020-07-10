package chapter10;

import java.util.*;

public class Homework10_5 {

	public static void main(String[] args) {

		System.out.print("Enter a positive integer: ");
		int num = new Scanner(System.in).nextInt();

		StackingOfIntegers stack = new StackingOfIntegers(20);

		int factor = 2;
		while (factor <= num) {
			if (num % factor == 0) {
				stack.push(factor);
				num /= factor;
			} else {
				factor++;
			}
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

	}
}
/*
Enter a positive integer: 120
5 3 2 2 2 
*/