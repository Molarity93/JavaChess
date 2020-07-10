package chapter11;

public class Account {
	int accNumber;
	double balance;
	double annualInterestRate;
	String dateCreated;

	public Account(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	this.accNumber = accNumber;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	this.dateCreated = dateCreated;
	}

	public void deposit(double amount)
	{
	balance = balance + amount;
	}

	public void withdraw(double amount)
	{
	balance = balance - amount;
	}

	@Override
	public String toString()
	{
	String res = "";
	res += "Account number : " + accNumber + "\n";
	res += "Balance is : " + balance + "\n";
	res += "Annual Interest Rate is : " + annualInterestRate + "\n";
	res += "Date created is : " + dateCreated + "\n";
	return res;
	}
	}
