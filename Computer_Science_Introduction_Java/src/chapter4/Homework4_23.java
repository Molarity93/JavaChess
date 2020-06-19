package chapter4;

import java.util.*;

public class Homework4_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Employeer's name: ");
		String name = new String(input.nextLine());

		System.out.println("Enter number of hours worked: ");
		double hoursWorked = input.nextDouble();

		System.out.println("Enter the hourly pay rate: ");
		double payRate = input.nextDouble();
		double grossPay = payRate * hoursWorked;

		System.out.println("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		double federalWithholdings = federalTaxRate * grossPay;

		System.out.println("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		double stateWithholdings = stateTaxRate * grossPay;

		double totalDeduction = federalWithholdings + stateWithholdings;

		double netPay = grossPay - totalDeduction;
		System.out.printf("Employee Name: " + "%2s\n", name);
		System.out.printf("Hours Worked: " + "%2.2f\n", hoursWorked);
		System.out.printf("Pay Rate: " + "$%2.2f\n", payRate);
		System.out.printf("Gross Pay: " + "$%2.2f\n", grossPay);
		System.out.printf("Deductions: \n");
		System.out.printf("Federal Withholding (20.0%%): " + "$%2.2f\n", federalWithholdings);
		System.out.printf("State Withholding (9.0%%): " + "$%2.2f/n", stateWithholdings);
		System.out.printf("Total Deduction: " + "$%2.2f\n", totalDeduction);
		System.out.printf("Net Pay: " + "$%2.2f", netPay);

		input.close();

	}

}
/*
Employeer's name: 
Smith
Enter number of hours worked: 
10
Enter the hourly pay rate: 
9.75
Enter federal tax withholding rate: 
.20
Enter state tax withholding rate: 
.09
Employee Name: Smith
Hours Worked: 10.00
Pay Rate: $9.75
Gross Pay: $97.50
Deductions: 
Federal Withholding (20.0%): $19.50
State Withholding (9.0%): $8.78/nTotal Deduction: $28.28
Net Pay: $69.23
 */

