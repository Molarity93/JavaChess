package chapter4;

import java.util.*;

public class Homework4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN in the format \"DDD-DD-DDD\": ");
		String socialSecurityNumber = input.nextLine();

		if (socialSecurityNumber.length() == 11) {

			if (!('0' <= socialSecurityNumber.charAt(0) && socialSecurityNumber.charAt(0) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (!('0' <= socialSecurityNumber.charAt(1) && socialSecurityNumber.charAt(1) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (!('0' <= socialSecurityNumber.charAt(2) && socialSecurityNumber.charAt(2) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (socialSecurityNumber.charAt(3) != '-')
				System.out.println(socialSecurityNumber + "is an Invalid SSN");

			else if (!('0' <= socialSecurityNumber.charAt(4) && socialSecurityNumber.charAt(4) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (!('0' <= socialSecurityNumber.charAt(5) && socialSecurityNumber.charAt(5) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (socialSecurityNumber.charAt(6) != '-')
				System.out.println(socialSecurityNumber + " is an Invalid SSN");

			else if (!('0' <= socialSecurityNumber.charAt(7) && socialSecurityNumber.charAt(7) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (!('0' <= socialSecurityNumber.charAt(8) && socialSecurityNumber.charAt(8) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (!('0' <= socialSecurityNumber.charAt(9) && socialSecurityNumber.charAt(9) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else if (!('0' <= socialSecurityNumber.charAt(10) && socialSecurityNumber.charAt(10) <= '9'))
				System.out.println(socialSecurityNumber + " is an Invalid SSN.");

			else
				System.out.println(socialSecurityNumber + " is your SSN.");
		}

		else
			System.out.println(socialSecurityNumber + " is an Invalid SSN.");
		input.close();
	}
}
/*
 * Enter a SSN in the format "DDD-DD-DDD": 232-23-5435 232-23-5435 is your SSN.
 * 
 * Enter a SSN in the format "DDD-DD-DDD": 23-23-5435 23-23-5435 is an Invalid
 * SSN.
 */

