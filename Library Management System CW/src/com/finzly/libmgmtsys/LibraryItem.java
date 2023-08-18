package com.finzly.libmgmtsys;

public class LibraryItem implements Reservable {

	private String title;
	private int itemID;
	
	LibraryItem(String title,int itemID){
		setTitle(title);
		setItemID(itemID);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	void displayInfo() {
		System.out.println("This is a library item class: The ItemID is "+getItemID()+" and the title is "+getTitle());
	}
	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("You can reserve library items");
	}

}

class Book extends LibraryItem implements Reservable {

	private String author;
    Book(String title,int itemID,String author){
		
		super(title,itemID);
		setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	void displayInfo() {
		System.out.println("This is a Book class: The item ID is "+getItemID()+" and title "+getTitle()+" which is written by "+getAuthor());
	}
	
	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("This Book is reserved");
	}
}

class DVD extends LibraryItem implements Reservable{

	private String duration;
	
	DVD(String title,int itemID,String duration){
		super(title,itemID);
		setDuration(duration);
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	void displayInfo() {
		System.out.println("This is a DVD class: The item ID is "+getItemID()+" and title "+getTitle()+" with duration of"+getDuration());
	}
	
	@Override
	public void reserveItem(LibraryItem item) {
		System.out.println("This DVD is reserved");
	}
}
