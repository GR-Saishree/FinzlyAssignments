package com.finzly.testquestions;

public class Student {
	
	private int studentID;
	private String name;
	private static int totalStudents;
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getTotalStudents() {
		return totalStudents;
	}

	public static void setTotalStudents(int totalStudents) {
		Student.totalStudents = totalStudents;
	}

	void enrollStudent(int studentID,String name) {
		this.studentID=studentID;
		this.name=name;
		totalStudents++;
		System.out.println("Student "+name+" has been enrolled");
	}
	
	void dropStudent(int studentID,String name) {
		System.out.println("Student "+name+" has been dropped");
		studentID=0;
		name=null;
		this.studentID=studentID;
		this.name=name;
		totalStudents--;
		
		
	}

}
