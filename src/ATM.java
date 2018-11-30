/**
 * Just like last time, the ATM class is responsible for managing all
 * of the user interaction. This means login procedures, displaying the
 * menu, and responding to menu selections. In the enhanced version, the
 * ATM class will have the added responsibility of interfacing with the
 * Database class to write and read information to and from the database.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

import java.util.Scanner;

public class ATM {
	
	private Scanner in;
	private BankAccount account;
	
	/**
	 * Constructs an ATM class.
	 * 
	 * @param account the account to be linked
	 */
	
	public ATM(BankAccount account) {
		this.account = account;
	}

	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the active account.
	 * 
	 * @return account
	 */

	public BankAccount getAccount() {
		return account;
	}

	/**
	 * Sets the active account.
	 * 
	 * @param account the new account
	 */
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	/////////////////////////////////// INSTANCE METHODS ///////////////////////////////////

	// TODO
	public void run() {
		in = new Scanner(System.in);
		
		System.out.println("Welcome to APCSA-ATM. Please enter your Account number and PIN.");
		// TODO// ask user for account number
		System.out.println("Account Number: ");
		int inAccountNum = in.nextInt();
		// ask user for pin
		System.out.println("Pin Number: ");
		int inpin = in.nextInt();
		menu();
	}
	public void menu(){
		// validate that account number and pin match
		if(inAccountNum.run == this.BankAccount.getAccountNumber() || inpin == this.BankAccount.getPin()) {
			System.out.println("Type 1 for deposit, 2 for withdraw, 3 for view balance, 4 for exit");
			int menunum = in.nextInt(); 
		if ( menunum == 1) {
			System.out.println("How much will you be depositing?");
        		int deposit = in.nextInt();
			int currentBalance = deposit + this.BankAccount.getBalance();
			System.out.println("Updated Balance: $" + currentBalance);
			menu();
		}if(menunum == 2) {
			System.out.println("How much will you be withdrawing?");
        		int withdraw = in.nextInt();
			int currentBalance = this.BankAccount.getBalance() - withdraw;
			System.out.println("Updated Balance: $" + currentBalance);
			menu();
		}if(menunum == 3) {
			System.out.println("Current Balance: $" + this.BankAccount.getBalance() );
		}if(menunum == 4 ){
			run();
		}else{
			run();
		}
	// to complete the ATM class, you need to provide the following functionality:
	//
	// 		- prompt the user to enter an account number and pin
	//		- validate that the accounut number and pin are valid
	//		- display a menu with available options
	//			+ deposit
	//			+ withdraw
	//			+ view balance
	//			+ exit
	//		- prompt the user to make a selection from the available menu options
	//		- respond accordingly to the user's selection
	//			+ this will involve calling methods of the BankAccount class
}