package com.finzly.testQuestion4;

public class Employee {

	private int id;
	private String name;
	
	Employee(String name,int id){
		setName(name);
		setId(id);
		displayDetails();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+getName());
		System.out.println("ID: "+getId());
	}
	
	
}
