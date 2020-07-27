package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternativeEmail;
	
	// Need a constructor to receive the first name and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.printf("EMAIL CREATED: %s %s %n", this.firstName, this.lastName);
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.printf("Department is: %s%n", this.department);
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
	
	//Set the mailbox capacity
	
	//Set the alternative email
	
	//Change the password
	
	

}
