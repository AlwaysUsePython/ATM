import java.util.HashMap;

public class ATM {
	
	// Using a hashmap to store all the accounts with their corresponding id numbers
	private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	
	// empty constructor...
	public ATM () {
		
	}
	
	// This method takes in an integer ID but no initial amount to create an account.
	public void openAccount(Integer id) {
		
		Account newAccount = new Account();
		
		
		// Try to put the account in the hash map, if not then print an error message
		try {
			accounts.put(id, newAccount);
		}
		catch (Exception e) {
			System.out.println("That account already exists!");
		}		
		
	}
	
	// This method takes in an integer ID and an initial amount to create an account.
	public void openAccount(Integer id, double amount) {
		
		// This rounding to the 100th's place forces the user to use cents - this way there won't be rounding errors.
		amount = Math.round(amount*100.0)/100.0;
		
		// create a new account object
		Account newAccount = new Account(amount);
		
		
		// Try to put the account in the hash map, if not then print an error message
		try {
			accounts.put(id, newAccount);
		}
		catch (Exception e) {
			System.out.println("That account already exists!");
		}		
		
	}

	// 
	public void depositMoney(Integer id, double amount) {
		
		amount = Math.round(amount*100.0)/100.0;
		
		try{
			accounts.get(id).deposit(amount);
		}
		catch (Exception e) {
			System.out.println("That account doesn't exist.");
		}
		
	}
	
	public void withdrawMoney(Integer id, double amount) {
		
		amount = Math.round(amount*100.0)/100.0;
		
		try{
			accounts.get(id).withdraw(amount);
		}
		catch (Exception e) {
			System.out.println("That account doesn't exist.");
		}
		
	}
	
	public double checkBalance(Integer id) {
		
		try{
			double amount =  accounts.get(id).getBalance();
			// This rounding to the 100th's place forces the user to use cents - this way there won't be rounding errors.
			amount = Math.round(amount*100.0)/100.0;
			return amount;
		}
		catch (Exception e) {
			return 0.0;
		}
		
	}
	
	public void closeAccount(Integer id) {
		
		try{
			if (accounts.get(id).getBalance() != 0) {
				System.out.println("Cannot close account because balance is not 0.");
				return;
			}
			accounts.remove(id);
		}
		catch (Exception e) {
			System.out.println("That account doesn't exist");
		}
	}
	
	
}
