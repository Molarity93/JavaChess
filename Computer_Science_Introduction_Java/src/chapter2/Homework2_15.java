package chapter2;

import java.util.*;

public class Homework2_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, x2;
		double y1, y2;

		System.out.print("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		double a = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double x = Math.pow(a, 0.5);
		System.out.println("The distance between the two points is " + x);
		input.close();

	}
}
/*
 
Enter x1 and y1: 1.5 -3.4 
Enter x2 and y2: 4 5 
The distance between the two points is 8.764131445842194
 
*/

