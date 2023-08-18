package com.finzly.libmgmtsys;

public class Main {

	
	public static void main(String[] args) {
		LibraryItem li=new LibraryItem("Library",100);
		li.displayInfo();
		li=new Book("Harry Potter",106,"J.K.Rowling");
		li.displayInfo();
		li.reserveItem(li);
		li=new DVD("RRR movie",108,"2:30:00");
		li.displayInfo();
		li.reserveItem(li);
		StudentMember sm=new StudentMember(456,"Sai shree");
		
		sm.borrowItem(li);
		
		FacultyMember fm=new FacultyMember(678,"Sai leela");
		fm.borrowItem(li);
	}
}
