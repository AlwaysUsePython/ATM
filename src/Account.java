

import java.util.*; 


public class Account {
	
	private double balance;
	private ArrayList<Double> transactions = new ArrayList<Double>();
	
	public Account(double balance) {
		this.balance = balance;
		transactions.add(balance);
	}
	
	public Account() {
		this.balance = 0.0;
	}
	
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Stop trying to break it, Mr. Theiss.");
			return;
		}
		balance += amount;
		transactions.add(amount);
		
	}
	
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Stop trying to break it, Mr. Theiss.");
			return;
		}
		
		if (balance >= amount) {
			balance -= amount;
			transactions.add(-amount);
		}
		else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}
