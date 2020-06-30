package chapter7;

import java.util.*;

public class Homework7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of students:");
		 
		  int n = input.nextInt();
		  double[] score = new double[n];
		  String[] names = new String[n];
		 
		  System.out.println("Enter student names and score:");
		 
		  for (int i = 0; i < score.length; i++) {
		   names[i] = input.next();
		   score[i] = input.nextDouble();
		  }
		  selectionSort(score, names);
		   
		  System.out.println("Student names and scores in decreasing order:");
		  for (int i = names.length - 1; i >= 0; i--) {
		   System.out.println(names[i] + ":" + score[i]);
		  }
		  input.close();
		 
		 }
		 
		 public static void selectionSort(double[] list, String[] names) {
		 
		  for (int i = 0; i < list.length - 1; i++) {
		   
		   double currentMin = list[i];
		   int currentMinIndex = i;
		 
		   for (int j = i + 1; j < list.length; j++) {
		    if (currentMin > list[j]) {
		     currentMin = list[j];
		     currentMinIndex = j;
		    }
		   }
		 
		   
		   if (currentMinIndex != i) {
		    list[currentMinIndex] = list[i];
		    list[i] = currentMin;
		   
		    String temp = names[currentMinIndex];
		    names[currentMinIndex] = names[i];
		    names[i] = temp;
	}
		  }
		 }
}

/*
Enter the number of students:6
Enter student names and score:
Jed 0
Ashley 9
Joe 2
Kea 5
Liz 22
Cory 44
Student names and scores in decreasing order:
Cory:44.0
Liz:22.0
Ashley:9.0
Kea:5.0
Joe:2.0
Jed:0.0
*/