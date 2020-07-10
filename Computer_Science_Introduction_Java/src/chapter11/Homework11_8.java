package chapter11;



import java.util.Random;
import java.util.Scanner;

public class Homework11_8 extends Account11_8  {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the customer name");

		String customerName = scanner.next();

		Random random = new Random();
		int id = random.nextInt(1000);
		System.out.println("enter the balance in your account");
		double balance = scanner.nextDouble();
		System.out.println("enter the annualinterest rate");
		double annualIntrestRate = scanner.nextDouble();

		Account11_8 account = new Account11_8(id, balance, customerName);
		account.setAnnualIntrestRate(annualIntrestRate);

		System.out.println("enter the money to deposit");
		double depositedAmount = scanner.nextDouble();
		double amount = account.deposite(depositedAmount);

		System.out.println("enter the money withdraw");

		double withdrawAmount = scanner.nextDouble();

		double amount1 = account.withDraw(withdrawAmount);

		System.out.println("the account information is");

		System.out.println(account.toString());

		System.out.println("the all transacions are");

		for (Transaction transaction : account.getTransactionsList()) {
			System.out.println(transaction.toString());
		}
		scanner.close();
	}

}

/*
enter the customer name
George
enter the balance in your account
1000
enter the annualinterest rate
1.5
enter the money to deposit
30
enter the money withdraw
40
the account information is
Account [id=589, balance=990.0, annualIntrestRate=1.5, customerName=George]
the all transacions are
Transaction [transactionDate=Fri Jul 10 15:16:40 PDT 2020, type=d, amount=30.0, balance=1030.0, description=i deposited the money with $30.0]
Transaction [transactionDate=Fri Jul 10 15:16:48 PDT 2020, type=w, amount=40.0, balance=990.0, description=i withdraw the money $40.0]
*/