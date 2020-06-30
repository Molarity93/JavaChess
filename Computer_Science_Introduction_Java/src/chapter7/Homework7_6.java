package chapter7;

public class Homework7_6 {

	public static void main(String[] args) {

		final int NUMBER_OF_PRIMES = 50; 
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int[] numbers = { 2 };
		int number = 2;

		System.out.println("The first 50 prime numbers are \n");

		while (numbers.length <= NUMBER_OF_PRIMES) {
			boolean isPrime = true; 

			for (int i = 0; i < numbers.length && numbers[i] <= Math.sqrt(number); i++) {
				int divisor = numbers[i];
				if (number % divisor == 0) { 
					isPrime = false; 
					break; 
				}
			}
			if (isPrime) {
				numbers = add2Array(numbers, number);

				if ((numbers.length - 1) % NUMBER_OF_PRIMES_PER_LINE == 0) {
					
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}

			
			number++;
		}
	}

	public static boolean copyArray(int[] source, int[] dest) {
		if (source.length > dest.length)
			return false;

		for (int i = 0; i < source.length; i++) {
			dest[i] = source[i];
		}
		return true;
	}

	public static int[] add2Array(int[] source, int data) {

		int[] dest = new int[source.length + 1];
		copyArray(source, dest);
		dest[source.length] = data;
		return dest;
	}
}

/*
The first 50 prime numbers are 

2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173
179 181 191 193 197 199 211 223 227 229
*/