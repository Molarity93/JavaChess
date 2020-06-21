package chapter6;

import java.util.*;

public class Homework6_34 {
	
	public static String retrieveMonthName(int month) {
		String monthName = "";
		switch(month){
			case 1: {
				monthName = "January";
				break;
			}
			case 2: {
				monthName = "Febuary";
				break;
			}
			case 3:{
				monthName = "March";
				break;
			}
			case 4:{
				monthName = "April";
				break;
			}
			case 5:{
				monthName = "May";
				break;
			}
			case 6:{
				monthName = "June";
				break;
			}
			case 7:{
				monthName = "July";
				break;
			}
			case 8:{
				monthName = "August";
				break;
			}
			case 9:{
				monthName = "September";
				break;
			}
			case 10:{
				monthName = "October";
			}
			case 11:{
				monthName = "November";
				break;
			}
			case 12:{
				monthName = "December";
				break;
			}
		}
		return monthName;
		
	}
	public static void theMonthHeading(int year, int month) {
		 System.out.println("      " + retrieveMonthName(month) + " " + year);
		 System.out.println("----------------------------");
		 System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	public 
	
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year (2020, etc.): ");
		int year = input.nextInt();
		System.out.println("Enter the month as a number between 1 and 12: ");
		int month = input.nextInt();
		
		System.out.println("" + theMonthHeading(year, month));
		input.close();
		
		
		
		
	}

}
