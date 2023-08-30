package com.finzly.collection.question4;

import java.util.Scanner;
public class Patient {

	Scanner sc=new Scanner(System.in);
	
	
	private int id;
	private String name;
	private int age;
	
	
	// constructor to initialize variables
	Patient(int id,String name,int age){
		setId(id);
		setName(name);
		setAge(age);
	}
	
	
	// Getters and Setters for ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Getters and Setters for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(isValidName(name)) {
			this.name = name;
		}
		else {
			System.out.println("Please enter a valid name");
			setName(sc.nextLine());
		}
		
	}
	
	// Method for validating name
	private static boolean isValidName(String patientName) {
		return patientName.matches("^[a-zA-Z. ]+$");
	}
	
	
	// Getters and Setters for age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<150)
			this.age = age;
		else {
			System.out.println("Please enter a valid age");
			setAge(sc.nextInt());
		}
	}
	@Override
	public String toString() {
		return "Patient Details: id=" + id + ", name=" + name + ", age=" + age ;
	}
	
	
}
