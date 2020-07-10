package chapter11;

public class SavingsAccount extends Account {
	public SavingsAccount(int accNumber, double balance, double annualInterestRate, String dateCreated) {
		super(accNumber, balance, annualInterestRate, dateCreated);
		}

		@Override
		public String toString()
		{
		String res = "Savings account Details\n";
		res += super.toString();
		return res;
		}
		}
