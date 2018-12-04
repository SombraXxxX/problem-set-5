import java.util.Scanner;

/**
 * Just like last time, the BankAccount class is primarily responsible
 * for depositing and withdrawing money. In the enhanced version, there
 * will be the added requirement of transfering funds between accounts.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class BankAccount {
	
	private static long generatedAccountNumber = 100000001L;
	
	private long accountNumber;
	private double balance;
	private User user;
	
	/**
	 * Constructor for BankAccount class.
	 * 
	 * @param balance
	 * @param user
	 */
	
	public BankAccount(double balance, User user) {
		this.accountNumber = BankAccount.generatedAccountNumber++;
		this.balance = balance;
		this.user = user;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	public BankAccount(String account) {
		long accountnumber = Long.parseLong(account.substring(0,9));
		int pin = Integer.parseInt(account.substring(9, 13));
		int balance = Integer.parseInt(account.substring(13, 28));
		String lastname = account.substring(28, 48);
		String firstname = account.substring(48, 63);
		String dob = account.substring(63, 71);
		long phone = Long.parseLong(account.substring(71, 81));
		String address = account.substring(81, 111).trim();
		String city = account.substring(111, 141).trim();
		String state = account.substring(141, 143);
		String postal = account.substring(143, 148);
		char status = account.charAt(148);
		
		this.accountNumber 
		this.balance
		this.user = new User();
		
		//process line
		//build account from parsed data
	}

	/**
	 * Retrieves the account number.
	 * 
	 * @return accountNumber
	 */
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Retrieves the balance.
	 * 
	 * @return balance
	 */
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Retrieves the user.
	 * 
	 * @return user
	 */
	
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the value of accountNumber.
	 * 
	 * @param accountNumber the new account number
	 */
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Sets the value of balance.
	 * 
	 * @param balance the new balance
	 */
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Sets the value of user.
	 * 
	 * @param user the new user
	 */
	
	public void setUser(User user) {
		this.user = user;
	}
	
	/////////////////////////////////// INSTANCE METHODS ///////////////////////////////////
	
	/**
	 * Deposits money into this account.
	 * 
	 * @param amount the money to deposit
	 * @return a status code (0: invalid amount, 1: success)
	 */
	
	Scanner in = new Scanner(System.in); 
	
	public int deposit(double amount) {
		if (amount <= 0.00) {
			System.out.println("invalid ammount");
			return 0;
		} else {
			balance = balance + amount;
			System.out.println("success");
			return 1;
		}
	}
	
	/**
	 * Withdraws money from this account.
	 * 
	 * @param amount the money to withdraw
	 * @return a status code (0: insufficient funds, 1: invalid amount, 2: success)
	 */
	
	public int withdraw(double amount) {
		if (amount > balance) {
			System.out.println("insufficient funds");
			return 0;
		} else if (amount <= 0.00) {
			System.out.println("invalid ammount");
			return 1;
		} else {
			balance = balance - amount;
			System.out.println("sucess");
			return 2;
		}
	}
	public int transfer(double amount) {
		
		return 2;
	}
}