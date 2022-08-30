

import java.util.*; 


public class Account {
	
	private double balance;
	// This is here because I misread part of the assignment... But I'm leaving it commented out because it couldn't hurt
	//private ArrayList<Double> transactions = new ArrayList<Double>();
	
	public Account(double balance) {
		this.balance = balance;
		//transactions.add(balance);
	}
	
	// Alternative 0 parameter constructor that sets the balance to 0 by default.
	public Account() {
		this.balance = 0.0;
	}
	
	// Deposits the amount and edits the balance. Also checks for negative deposits.
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Stop trying to break it, Mr. Theiss.");
			return;
		}
		balance += amount;
		//transactions.add(amount);
		
	}
	
	// Withdraws from the account, but only if there is money to withdraw and if there is enough money in the account
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Stop trying to break it, Mr. Theiss.");
			return;
		}
		
		if (balance >= amount) {
			balance -= amount;
			//transactions.add(-amount);
		}
		else {
			System.out.println("Insufficient funds.");
		}
	}
	
	// Getter. Yawn.
	public double getBalance() {
		return balance;
	}
	
}
