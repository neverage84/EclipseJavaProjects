package studentsdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String classYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	
	//Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter student First Name");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student Last Name");
		this.lastName = in.nextLine();
		
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter class level");
		this.gradeYear = in.nextInt();
		this.classYear = this.getClassYear(this.gradeYear);
		System.out.printf("First Name: %s%n Last Name:%s%n Grade: %s%n", this.firstName, this.lastName, this.classYear);
	}
	
	private String getClassYear(int gradeYear) {
		switch (gradeYear) {
		case 1:
			return "Freshman";
		case 2:
			return "Sophomore";
		case 3:
			return "Junior";
		default:
			return "Senior";
		}
	}
	//Generate an ID
	
	//Enroll in courses
	
	//View balance 
	
	//Pay tuition
	
	//Show status
}
