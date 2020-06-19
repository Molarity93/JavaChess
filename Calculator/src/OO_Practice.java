import java.util.Scanner;

public class OO_Practice {
	
	double data;
	
	public OO_Practice(double data) {
		this.data = data;
	}
	
	public void add(double secondNumber) {
		data += secondNumber;
	}

	public void subtract(double secondNumber) {
		data -= secondNumber;
	}

	public void multiply(double secondNumber) {
		data *= secondNumber;
	}

	public void divide(double secondNumber) {
		data /= secondNumber;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the first number: ");

		double firstNumber = input.nextDouble();
		OO_Practice first = new OO_Practice(firstNumber);
		System.out.println("Insert the second number: ");
		double secondNumber = input.nextDouble();
		first.add(secondNumber);
		System.out.println("This is when added together: " + first.data);
		input.close();
	}

}
