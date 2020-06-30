package chapter7;

import java.util.Scanner;

public class Homework7_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list1 (6 numbers): ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.println("Enter list2 (5 numbers): ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int[] list3 = merge(list1, list2);
		System.out.println("The merged list is: ");
		for (int i = 0; i < list3.length; i++) {
			System.out.println(list3[i] + "");
		}
		input.close();
	}

	public static int[] merge(int[] list1, int[] list2) {
		
		int[] list3 = new int[list1.length + list2.length];
		int j = 0, k = 0;
		  for (int i = 0; i < list3.length; i++) {
		   if (k < list2.length&&list1[j] > list2[k] ) {
		    list3[i] = list2[k];
		    k++;
		   } else if (j < list1.length) {
		    list3[i] = list1[j];
		    j++;
		   }
		 
		  }
		 

		return list3;

	}

}
/*

Enter list1 (6 numbers): 
5 1 5 16 61 111
Enter list2 (5 numbers): 
4 2 4 5 6
The merged list is: 
1
2
4
5
5
6
16
61
111

 */
