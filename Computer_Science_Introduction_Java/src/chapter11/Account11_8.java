package chapter11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account11_8 {
	 private int id = 0;
	   private double balance = 0;
	   private double annualIntrestRate = 0;
	   private Date dateCreated;
	   private String customerName;
	   
	   private static List<Transaction> transactionsList = null;

	   public List<Transaction> getTransactionsList() {
	       if (transactionsList == null) {
	           transactionsList = new ArrayList<Transaction>();
	           return transactionsList;
	       }
	       return transactionsList;
	   }

	   public Account11_8(int id, double balance, String customerName) {
	       this.id = id;
	       this.balance = balance;
	       this.customerName = customerName;
	   }

	   @Override
	   public String toString() {
	       return "Account [id=" + id + ", balance=" + balance
	               + ", annualIntrestRate=" + annualIntrestRate
	               + ", customerName=" + customerName + "]";
	   }

	   public Account11_8() {
	       id = 0;
	       balance = 0;
	       annualIntrestRate = 0;
	       dateCreated = null;
	       customerName = null;

	   }

	   public Account11_8(int id, double balance) {
	       this.id = id;
	       this.balance = balance;
	   }

	   public int getId() {
	       return id;
	   }

	   public void setId(int id) {
	       this.id = id;
	   }

	   public double getBalance() {
	       return balance;
	   }

	   public void setBalance(double balance) {
	       this.balance = balance;
	   }

	   public double getAnnualIntrestRate() {
	       return annualIntrestRate;
	   }

	   public void setAnnualIntrestRate(double annualIntrestRate) {
	       this.annualIntrestRate = annualIntrestRate;
	   }

	   public Date getDateCreated() {
	       return dateCreated;
	   }

	   public void setDateCreated(Date dateCreated) {
	       this.dateCreated = dateCreated;
	   }

	   public double getMonthlyInterestRate() {
	       return (this.getAnnualIntrestRate() / 12);
	   }

	   public double getMonthlyInterest() {
	       return (getBalance() * getMonthlyInterestRate() / 100);
	   }

	   public double withDraw(double balance) {
	       double transactionAmount = balance;
	       this.setBalance(this.getBalance() - balance);

	       Date transactiondate = new Date();
	       char transactionType = 'w';
	       double remainingbalance = this.getBalance();
	       String description = "i withdraw the money $" + transactionAmount;
	       Transaction transaction = new Transaction(transactiondate,
	               transactionType, transactionAmount, remainingbalance,
	               description);

	       List<Transaction> list = getTransactionsList();
	       list.add(transaction);
	       return this.getBalance();
	   }

	   public double deposite(double balance) {
	       double transactionAmount = balance;
	       this.setBalance(this.getBalance() + balance);
	       Date transactiondate = new Date();
	       char transactionType = 'd';
	       double remainingbalance = this.getBalance();
	       String description = "i deposited the money with $" + transactionAmount;
	       Transaction transaction = new Transaction(transactiondate,
	               transactionType, transactionAmount, remainingbalance,
	               description);

	       List<Transaction> list = getTransactionsList();
	       list.add(transaction);

	       return this.getBalance();
	   }

	   public double totalBalance() {
	       balance = balance + getMonthlyInterest();
	       return balance;
	   }
}
