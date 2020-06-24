package chapter6;

import java.util.*;

public class Homework6_34_ {
	
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter full year (e.g., 2001): ");
		int year = input.nextInt();

		System.out.print("Enter month in number between 1 and 12: ");
		int month = input.nextInt();
		
		printMonth(year, month);
		
		input.close();
	}

	public static void printMonth(int year, int month) {
		
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}

	public static void printMonthTitle(int year, int month) {
		System.out.println("         " + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}

		return monthName;
	}

	public static void printMonthBody(int year, int month) {
		
		int startDay = getStartDay(year, month);

		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}
	
	public static int getStartDay(int year, int month) {

		int y = year;
		int m = month;
		int q = 1;

		if (m == 1 || m == 2) {
			m = m + 12;
			y = y - 1;
		}

		int j = y / 100;
		int k = y % 100;
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String day = "";

		switch (h) {

		case 0:
			h = 6;
			break;
		case 1:
			h = 7;
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			h--;

		}

		return h;

	}

	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}

/*
 * Enter full year (e.g., 2001): 2020
Enter month in number between 1 and 12: 1
         January 2020
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30  31
 */
