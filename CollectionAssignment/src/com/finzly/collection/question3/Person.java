package com.finzly.collection.question3;

// import statements
import java.util.Scanner;

public class Person {

	
	// Person class variables
	private String name;
	private String gender;
	private int age;
	
	static Scanner sc=new Scanner(System.in);
	
	// Getters and setters for name
	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(isValidName(name)) {
			this.name=name;
		}
		else {
			System.out.println("Enter a valid name");
			setName(sc.nextLine());
		}
		
	}


	// Method for validating name
    private static boolean isValidName(String name) {
		return name.matches("^[a-zA-Z. ]+$");
	}
    
    // Getters and Setters for gender
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		if(!gender.isEmpty()) {
			this.gender=gender;
		}
		else {
			System.out.println("Enter a valid gender");
			setGender(sc.nextLine());
		}
		
	}


	// Getters and Setters for age
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>0 && age<150) {
			this.age=age;
		}
		else {
			System.out.println("Enter a valid age");
			setAge(sc.nextInt());
		}
	}


	public Person(String name, String gender, int age) {
		super();
		setName(name);
		setGender(gender);
		setAge(age);
	}
	
	
}
