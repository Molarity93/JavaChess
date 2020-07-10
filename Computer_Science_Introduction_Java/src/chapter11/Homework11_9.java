package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework11_9 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

	
		System.out.print("Enter the array size n: ");
		int n = input.nextInt();

		
		int[][] array = new int[n][n];

		
		fill(array);

		
		print(array);

	
		System.out.print("The largest row index: ");
		print(largestRow(array));
		System.out.print("The largest column index: ");
		print(largestColumn(array));
		input.close();
	}

	
	public static void print(ArrayList<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println();
	}


	public static ArrayList<Integer> largestColumn(int[][] array) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	
	public static ArrayList<Integer> largestRow(int[][] array) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[j][i] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	} 

	
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}


	public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == x)
				list.add(i);
		}
	}
	

	public static void fill(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
			}
		}
	}

	
	public static void print(int[][] array) {
		System.out.println("The random array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	}
/*
Enter the array size n: 4
The random array is
1010
0101
0011
1100
The largest row index: 0 1 2 3 
The largest column index: 0 1 2 3 
*/
