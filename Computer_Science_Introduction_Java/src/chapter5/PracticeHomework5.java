package chapter5;

import java.util.*;

public class PracticeHomework5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		int factor = 2;

		input.close();

		while (factor <= number) {
			if (number % factor == 0) {
				System.out.print(factor + " ");
				number /= factor;
			} else
				factor++;
		}
	}

}
