import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * This class will serve as the intermediary between our ATM program and
 * the database of BankAccounts. It'll be responsible for fetching accounts
 * when users try to login, as well as updating those accounts after any
 * changes are made.
 */

public class Database {
	private File data;
	Database(File data) {

		this.data = data;
	}
	BankAccount gitaccount(int Pin, long accountNumber ) {
		try(BufferedReader br = new BufferedReader(new FileReader(data))) { 
			String line;
				while ((line = br.readLine()) != null) {
					int pin = Integer.parseInt(line.substring(9, 13));
					long accountnumber = Long.parseLong(line.substring(0,8));
					int balance = Integer.parseInt(line.substring(14, 25));
					String lastname = line.substring(26, 45);
					
					//process line
					//build account from parsed data
				}
		}
		return account;
	}
}