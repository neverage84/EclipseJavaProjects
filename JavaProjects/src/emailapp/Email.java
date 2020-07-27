package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternativeEmail;
	private String companySuffix = "aeycompany.com";
	
	
	// Need a constructor to receive the first name and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.printf("EMAIL CREATED: %s %s %n", this.firstName, this.lastName);
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.printf("Department is: %s%n", this.department);
		
		//Call a method that returns a random password
		this.password = this.randomPassword(defaultPasswordLength);
		System.out.printf("You new random password is %s%n", password);
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.printf("Your email is: %s%n", email );
	}
	//Ask for the department
	private String setDepartment() {
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n 0 for none");
		Scanner scanner = new Scanner(System.in);
		int depChoice = scanner.nextInt();
		scanner.close();
		switch (depChoice) {
		case 1:
			return "sales";
		case 2:
			return "development";
		case 3:
			return "accounting";
		default:
			return " ";
		}	
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ10234567890!@#$%^&*()";
		char[]password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	
	
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternative email
	public void setAlternatateEmail (String altEmail){
		this.alternativeEmail = altEmail;
	}
	//Change the password
	
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
	

}
