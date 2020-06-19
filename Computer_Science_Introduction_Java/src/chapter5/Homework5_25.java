package chapter5;

import java.util.*;

public class Homework5_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer 10000: ");
		int count = input.nextInt();
		double pi = 0;
		double denominator = 1;

		input.close();
		while (count < 100000) {
			for (int i = 0; i < count; i++) {
				if (i % 2 == 0) {
					pi = pi + (1 / denominator);
				} else {
					pi = pi - (1 / denominator);
				}
				denominator += 2;
			}
			pi *= 4;
			System.out.println(pi);
			count += 10000;
			System.out.println(count);
		}
	}

}
/*
Enter an integer: 
10000
3.1414926535900345
20000
12.566037281026608
30000
50.264165790773355
40000
201.05666982975973
50000
804.2266826523694
60000
3216.9067325142446
70000
12867.626931247545
80000
51470.50772578291
90000
205882.03090368543
100000
 */
