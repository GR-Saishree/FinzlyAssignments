package com.finzly.libmgmtsys;
import java.util.Scanner;
public abstract class LibraryMember {

	private int memberID;
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	LibraryMember(int memberID, String name){
		setMemberID(memberID);
		setName(name);
	}
	
	abstract void borrowItem(LibraryItem item);
}

class StudentMember extends LibraryMember{
	
	StudentMember(int memberID, String name){
		super(memberID,name);
	}
	@Override
	void borrowItem(LibraryItem item) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item id you need to borrow");
		int itemID=sc.nextInt();
		System.out.println("Student,you have borrowed item id:"+itemID);
		
	}
}

class FacultyMember extends LibraryMember{
	
	FacultyMember(int memberID, String name){
		super(memberID,name);
	}
	@Override
	void borrowItem(LibraryItem item) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item id you need to borrow");
		int itemID=sc.nextInt();
		System.out.println("Faculty,you have borrowed item id:"+itemID);
	}
}