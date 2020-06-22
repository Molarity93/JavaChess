import java.util.*;

public class SimpleCalculator {


	public static double add(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

	public static double subtract(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}

	public static double multiply(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}

	public static double divide(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		return result;
	}

	public static double remainder(double firstNumber, double secondNumber) {
		double result = firstNumber % secondNumber;
		return result;
	}

	public static double exponent(double firstNumber, double secondNumber) {
		double result = Math.pow(firstNumber, secondNumber);
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the first number: ");
		
		double firstNumber = input.nextDouble();
		System.out.println("Insert the second number: ");
		double secondNumber = input.nextDouble();
		
		System.out.println("This is when added together: " + add(firstNumber, secondNumber));
		System.out.println("This is when subtracted together: " + subtract(firstNumber, secondNumber));
		System.out.println("This is when multiplied together: " + multiply(firstNumber, secondNumber));
		System.out.println("This is when " + firstNumber + " is divided by " + secondNumber + ": "
				+ divide(firstNumber, secondNumber));
		System.out.println("This is the remainer: " + remainder(firstNumber, secondNumber));
		System.out.println("When " + firstNumber + " is raised to the power of " + secondNumber + ": "
				+ exponent(firstNumber, secondNumber));
		

		input.close();
	}

}
