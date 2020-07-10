package chapter11;

import java.util.Date;

public class Transaction {
	protected Date transactionDate;
	   protected char type;
	   protected double amount;
	   protected double balance;
	   protected String description;

	   public Transaction(Date transactionDate, char type, double amount,
	           double balance, String description) {
	       this.transactionDate = transactionDate;
	       this.type = type;
	       this.amount = amount;
	       this.balance = balance;
	       this.description = description;
	   }

	   @Override
	   public String toString() {
	       return "Transaction [transactionDate=" + transactionDate + ", type="
	               + type + ", amount=" + amount + ", balance=" + balance
	               + ", description=" + description + "]";
	   }
}
