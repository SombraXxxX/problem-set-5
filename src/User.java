/**
 * Just like last time, the User class is responsible for retrieving
 * (i.e., getting), and updating (i.e., setting) user information.
 * This time, though, you'll need to add the ability to update user
 * information and display that information in a formatted manner.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */
import java.util.Scanner;

public class User {
	private Scanner in;
	private int pin;
	private String lastName;
	private String firstName;
	private String dob;
	private int phonenumber;
	private String streetaddress;
	private String city;
	private String state;
	private String postalcode;
	/**
	 * Constructor for User class.
	 * 
	 * @param name
	 * @param dob
	 * @param address
	 */
	
	public User(int pin, String firstName, String lastName, String dob, String streetaddress, int phonenumber, String city, String state, String postalcode) {
		this.pin = pin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.streetaddress = streetaddress;
		this.phonenumber = phonenumber;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}
	
	/////////////////////////////////// GETTERS AND SETTERS ///////////////////////////////////
	
	/**
	 * Retrieves the user's PIN.
	 * 
	 * @return pin
	 */
	
	public int getPIN() {
		return pin;
	}
	
	/**
	 * Retrieves the user's name.
	 * 
	 * @return name
	 */
	
	public String getlastName() {
		return lastName;
	}
	public String getfirstName() {
		return firstName;
	}
	/**
	 * Retrieves the user's date of birth.
	 * 
	 * @return dob
	 */
	
	public String getDOB() {
		return dob;
	}
	
	/**
	 * Retrieves the user's address.
	 * 
	 * @return address
	 */
	
	public String getstreetaddress() {
		return streetaddress;
	}
	public int getphonenumber() {
		return phonenumber;
	}
	public String getcity() {
		return city;
	}
	public String state() {
		return state;
	}
	public String postalcode() {
		return postalcode;
	}
	/**
	 * Sets the value of the user's PIN.
	 * 
	 * @param pin the new PIN
	 */
	
	public void setPIN(int pin) {
		this.pin = pin;
	}
	
	/**
	 * Sets the value of the user's name.
	 * 
	 * @param name the new name
	 */
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Sets the value of the user's date of birth.
	 * 
	 * @param dob the new date of birth
	 */
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	/**
	 * Sets the value of the user's address.
	 * 
	 * @param address the new address
	 */
	
	public void setstreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	public void setphonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public void setstate(String state) {
		this.state = state;
	}
	public void setpostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public void changepin(){
	Scanner in = new Scanner(System.in); 
	System.out.println("Please enter current pin to modify current pin:");
	int inputpin = in.nextInt();
	if(inputpin == pin) {
	System.out.println("Please enter new pin:");	
	int newpin = in.nextInt();
	pin = newpin;
}else {
	System.out.println("Wrong pin please try again");
	}
}
}