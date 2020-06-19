package BankOfAmerica;
import java.util.*;

public class SavingsAccount {

	double balance;
	
	public SavingsAccount(double initialBalance) {
		balance = initialBalance;

	}

	public void checkBalance() {

		System.out.println("Your balance is: " + balance);
	}

	public void deposit(double myDeposit) {
		balance = myDeposit + balance;
		System.out.println("You have deposited: " + myDeposit);
	}

	public double withdrawl(double myWithdrawl) {
		balance -= myWithdrawl;
		System.out.println("You have withdrawn: " + myWithdrawl);
		return myWithdrawl;
	}

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		SavingsAccount vince = new SavingsAccount(4000);
		
		vince.checkBalance();
		vince.deposit(500);
		vince.checkBalance();
		vince.withdrawl(1000);
		vince.checkBalance();
		input.close();
	}

}
