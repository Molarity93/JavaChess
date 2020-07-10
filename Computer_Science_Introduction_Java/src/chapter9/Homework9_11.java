package chapter9;

import java.util.*;

public class Homework9_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		ALinearEquationClass linear = new ALinearEquationClass(a, b, c, d, e, f);

		if (linear.isSolvable()) {
			System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
		input.close();
	}

}

/*
Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0

Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution.
*/