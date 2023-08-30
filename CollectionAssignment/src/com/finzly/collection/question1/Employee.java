package com.finzly.collection.question1;

// import statements
import java.util.Scanner;

public class Employee {

	// Employee class variables
	private static int lastAssignedId=0;
	private int ID=0;
	private String employeeName;
	private String emailID;
	private String phoneNumber;
	private String department;
	private double salary;
	
	// Scanner to get input from user
	Scanner sc=new Scanner(System.in);
	
	// Constructor which calls addEmployee() method
	Employee(){
		lastAssignedId++;
		setID(lastAssignedId);
		addEmployee();
	}
	
	
	
	// Getters and Setters for ID
	public int getID() {
		return ID;
	}
	
    public void setID(int iD) {
		ID = iD;
	}


    // Getters and Setters for Employee Name
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		if(isValidName(employeeName)) {
			this.employeeName = employeeName;
		}
		else {
			System.out.println("Please enter a valid name");
			setEmployeeName(sc.nextLine());
		}
		
	}
	
	// Method for validating employee name
	private static boolean isValidName(String employeeName) {
		return employeeName.matches("^[a-zA-Z. ]+$");
	}
	
	
	// Getters and Setters for Email ID
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		if(isValidEmail(emailID)) {
			this.emailID = emailID;
		}
		else {
			System.out.println("Enter a valid email address");
			setEmailID(sc.nextLine());
		}
			
	}
	
	// Method for validating email
	private static boolean isValidEmail(String emailID) {
		return emailID.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$");
	}
	
	
	// Getters and Setters for Phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(isValidPhoneNumber(phoneNumber)) {
			this.phoneNumber = phoneNumber;
		}
		else {
			System.out.println("Please enter a valid phone number");
			setPhoneNumber(sc.nextLine());
		}
	}
	
	// Method for validating Phone number
	private static boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^\\+\\d{2}\\d{10}$");
	}
	
	
	// Getters and Setters for Department
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		if(isValidDepartment(department)) {
			this.department = department;
		}
		else {
			System.out.println("Please enter a valid department name");
			setDepartment(sc.nextLine());
		}
	}
	
	// Method for validating Department
	private static boolean isValidDepartment(String department) {
		return department.matches("^[a-zA-Z ]+$");
	}
	
	
	// Getters and Setters for salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Enter a valid salary");
			setSalary(sc.nextDouble());
		}
		
	}
	
	
	
	
	// Method to add employee details
	void addEmployee() {
		
		// getting input from user and after validation setting the values
		
		System.out.println("Enter Employee Name:");
		String employeeName=sc.nextLine();
		setEmployeeName(employeeName);
		
		
		System.out.println("Enter Employee Email:");
		String emailID=sc.nextLine();
		setEmailID(emailID);
		
		
		System.out.println("Enter Employee Phone number:");
		String phoneNumber=sc.nextLine();
		setPhoneNumber(phoneNumber);
		
		
		System.out.println("Enter Employee Department:");
		String department=sc.nextLine();
		setDepartment(department);
		
		
		System.out.println("Enter Employee salary:");
		double salary=sc.nextDouble();
		setSalary(salary);
		
		
		sc.nextLine();
		

		
	}
	


	// Overridden toString() method
	@Override
	public String toString() {
		return "Employee Details: employee ID= "+ ID +", employeeName=" + employeeName + ", emailID=" + emailID + ", phoneNumber=" + phoneNumber
				+ ", department=" + department + ", salary=" + salary;
	}
	
	
	
}
