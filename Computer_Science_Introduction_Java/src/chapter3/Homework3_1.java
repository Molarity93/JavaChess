package chapter3;

import java.util.*;

public class Homework3_1 {

	public static void main(String[] args) {
		float r1, r2;
		Scanner input = new Scanner(System.in);

		System.out.println("Input the a variable: ");
		double a = input.nextDouble();

		System.out.println("Input the b variable: ");
		double b = input.nextDouble();

		System.out.println("Input the c variable: ");
		double c = input.nextDouble();

		double x = Math.pow(b, 2) - (4 * a * c);

		r1 = (float) ((-b + Math.pow(x, 0.5)) / (2 * a));
		r2 = (float) ((-b - Math.pow(x, 0.5)) / (2 * a));

		if (x > 0)
			System.out.println("The roots are: " + r1 + " and " + r2);

		else if (x == 0)
			System.out.println("The roots is: " + r1);

		else
			System.out.println("The system has no real roots");

		input.close();
	}

}

/*

Input the a variable: 1 
Input the b variable: 2 
Input the c variable: 3 
The system has no real roots

Input the a variable: 1.0 
Input the b variable: 3 
Input the c variable: 1 
The roots are: -0.38196602 and -2.618034

Input the a variable: 1 
Input the b variable: 2.0 
Input the c variable: 1 
The roots is: -1.0
 
 */
