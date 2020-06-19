package chapter5;

import java.util.*;

public class Homework5_29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year 2013: ");
		int year = input.nextInt();
		System.out.println("Enter the start day 2: ");
		int startDay = input.nextInt();
		int numberOfDaysInMonth = 0;
		input.close();

		for (int month = 1; month <= 12; month++) {
			System.out.print("          ");
			switch (month) {
			case 1:
				System.out.println("January " + year);
				numberOfDaysInMonth = 31;
				break;
			case 2:
				System.out.println("February " + year);
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
					numberOfDaysInMonth = 29;
				} else {
					numberOfDaysInMonth = 28;
				}
				break;
			case 3:
				System.out.println("March " + year);
				numberOfDaysInMonth = 31;
				break;
			case 4:
				System.out.println("April " + year);
				numberOfDaysInMonth = 30;
				break;
			case 5:
				System.out.println("May " + year);
				numberOfDaysInMonth = 31;
				break;
			case 6:
				System.out.println("June " + year);
				numberOfDaysInMonth = 30;
				break;
			case 7:
				System.out.println("July " + year);
				numberOfDaysInMonth = 31;
				break;
			case 8:
				System.out.println("August " + year);
				numberOfDaysInMonth = 31;
				break;
			case 9:
				System.out.println("September " + year);
				numberOfDaysInMonth = 30;
				break;
			case 10:
				System.out.println("October " + year);
				numberOfDaysInMonth = 31;
				break;
			case 11:
				System.out.println("November " + year);
				numberOfDaysInMonth = 30;
				break;
			case 12:
				System.out.println("December " + year);
				numberOfDaysInMonth = 31;
			}
			System.out.println("-----------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

			for (int i = 0; i < startDay; i++) {
				System.out.print("    ");
			}
			for (int i = 1; i <= numberOfDaysInMonth; i++) {
				if (i < 10) {
					System.out.print("   " + i);
				} else {
					System.out.print("  " + i);
				}
				if ((i + startDay) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println("");

			startDay = (startDay + numberOfDaysInMonth) % 7;
		}
	}

}
/*
Enter the Year 2013: 
2013
Enter the start day 2: 
2
        January 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
           1   2   3   4   5
   6   7   8   9  10  11  12
  13  14  15  16  17  18  19
  20  21  22  23  24  25  26
  27  28  29  30  31
          February 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28
          March 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
          April 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30
          May 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30  31
          June 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28  29
  30
          July 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30  31
          August 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31

          September 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30
          October 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
           1   2   3   4   5
   6   7   8   9  10  11  12
  13  14  15  16  17  18  19
  20  21  22  23  24  25  26
  27  28  29  30  31
          November 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30

          December 2013
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31

*/