package chapter8;

import java.util.*;

public class Homework8_2 {

	public static void main(String[] args) {

		double[][] matrix = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}

		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

		input.close();
	}

	public static double sumMajorDiagonal(double[][] m) {

		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][row];
		}
		return sum;
	}

}
/*
Enter a 4-by-4 matrix row by row: 
1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16
Sum of the elements in the major diagonal is 34.5
*/