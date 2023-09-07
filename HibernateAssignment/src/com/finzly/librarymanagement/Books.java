package com.finzly.librarymanagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {

	private int publishyear;
	private String title;
	private String author;
	private String isbn;
	
	@Id
	public int getPublishyear() {
		return publishyear;
	}
	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Books : publishyear=" + publishyear + ", title=" + title + ", author=" + author + ", isbn=" + isbn;
	}
	
	
}
