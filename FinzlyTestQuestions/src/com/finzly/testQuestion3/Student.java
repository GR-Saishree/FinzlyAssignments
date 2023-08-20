package com.finzly.testQuestion3;

public class Student {

	private String name;
	private int age;
	private int studentID;
	private static int uniqueID=1;
	
	
	Student(){
		setName("Unknown");
		setAge(0);
		studentID=uniqueID++;
		studentDetails();
		
	}
	
	Student(String name,int age){
		setName(name);
		setAge(age);
		studentID=uniqueID++;
		studentDetails();
	}
	
	Student(String name,int age,int studentID){
		setName(name);
		setAge(age);
		setStudentID(studentID);
		studentDetails();
	}
	
	Student(int age){
		setAge(age);
		studentDetails();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0 && age<200) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age");
		}
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	
	
	public void studentDetails() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Student ID: "+getStudentID());
	}
	
	
}
