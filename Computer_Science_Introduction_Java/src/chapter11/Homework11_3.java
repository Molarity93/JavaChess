package chapter11;

public class Homework11_3 {

	public static void main(String[] args) {
		Account acct = new Account(1001, 500, 3.5, "07-04-2020");
		CheckingAccount cacct = new CheckingAccount(1002, 1000, 4.0, "07-07-2020");
		SavingsAccount sacct = new SavingsAccount(1003, 750, 4.0, "07-09-2020");
		System.out.println(acct.toString());
		System.out.println(cacct.toString());
		System.out.println(sacct.toString());
	}
	}
/*
Annual Interest Rate is : 4.0
Date created is : 07-07-2020

Savings account Details
Account number : 1003
Balance is : 750.0
Annual Interest Rate is : 4.0
Date created is : 07-09-2020
*/