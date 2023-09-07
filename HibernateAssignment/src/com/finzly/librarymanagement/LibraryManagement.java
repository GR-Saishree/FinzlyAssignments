package com.finzly.librarymanagement;

import java.util.List;
import java.util.Scanner;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class LibraryManagement {

	
	
	
	void addBook(int publishyear,String title, String author, String isbn) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Books books = new Books();
		books.setPublishyear(publishyear);
		books.setTitle(title);
		books.setAuthor(author);
		books.setIsbn(isbn);
		session.save(books);
		System.out.println("Book added successfully");
		tr.commit();
		session.close();
		
	}
	
	void searchByYear(int startRange, int endRange) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Books books = new Books();
		Criteria criteria = session.createCriteria(Books.class);
		criteria.add(Restrictions.between("publishyear",startRange,endRange));
		List<Books> list = criteria.list();
		System.out.println("Book published in the specified year:");
		for(Books books1: list) {
			System.out.println(books1);
		}
		session.close();
	}
	
	void searchByAuthor(String author) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Books books = new Books();
		Criteria criteria = session.createCriteria(Books.class);
		criteria.add(Restrictions.eq("author",author));
		List<Books> list = criteria.list();
		System.out.println("Book published by specified author");
		for(Books books1: list) {
			System.out.println(books1);
		}
		session.close();
	}
	
	void searchByTitle(String title) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Books books = new Books();
		Criteria criteria = session.createCriteria(Books.class);
		criteria.add(Restrictions.like("title",title));
		List<Books> list = criteria.list();
		System.out.println("Books matching your title");
		for(Books books1: list) {
			System.out.println(books1);
		}
		session.close();
	}
	
	void searchByIsbn(String isbn) {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Books books = new Books();
		Criteria criteria = session.createCriteria(Books.class);
		criteria.add(Restrictions.eq("isbn",isbn));
		List<Books> list = criteria.list();
		System.out.println("Book matching specified isbn");
		for(Books books1: list) {
			System.out.println(books1);
		}
		session.close();
		
	}
	
	void displayAllBooks() {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Books.class);
		criteria.add(Restrictions.isNotNull("isbn"));
		List<Books> list = criteria.list();
		System.out.println("List of all books");
		for(Books books1: list) {
			System.out.println(books1);
		}
		tr.commit();
		session.close();
	}
	
	void updateBookDetails(String author,String isbn,String title,int publishyear) {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		String hql="UPDATE Books SET author=:author,title=:title,publishyear=:publishyear WHERE isbn=:isbn";
		Query query = session.createQuery(hql);
		query.setParameter("author", author);
		query.setParameter("title", title);
		query.setParameter("publishyear", publishyear);
		query.setParameter("isbn", isbn);
		query.executeUpdate();
		tr.commit();
		System.out.println("Book details updated successfully");
		session.close();
	}
	
	void deleteBookDetails(String isbn) {
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		String hql = "DELETE FROM Books WHERE isbn = :isbn";
		Query query = session.createQuery(hql);
		query.setParameter("isbn",isbn);
		query.executeUpdate();
		System.out.println("Book detail deleted successfully");
		tr.commit();
		session.close();
	}
	

	public static void main(String[] args) {
		
		LibraryManagement libMng = new LibraryManagement();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1. Add new book");
		System.out.println("2. Search for books -> a. Within specific range of year , b. author of book , c. title of book , d. ISBN number , e. display list of books");
		System.out.println("3. Update the details of book");
		System.out.println("4. Delete a book");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
		String choice= sc.nextLine();
		switch(choice) {
		
		case"1":System.out.println("Enter title");
		        String title = sc.nextLine();
		        System.out.println("Enter author");
		        String author = sc.nextLine();
		        System.out.println("Enter publication year");
		        int publishYear = sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter ISBN");
		        String isbn = sc.nextLine();
		        libMng.addBook(publishYear, title, author, isbn);
		        break;
		        
		case"a": System.out.println("Enter range");
		         int startRange = sc.nextInt();
		         int endRange = sc.nextInt();
		         sc.nextLine();
		         libMng.searchByYear(startRange,endRange);
		         break;
		         
		case"b": System.out.println("Enter author");
				 String author1 = sc.nextLine();
				 libMng.searchByAuthor(author1);
				 break;
				 
		case"c": System.out.println("Enter title or keywords in title");
		         String title1 = sc.nextLine();
		         libMng.searchByTitle(title1);
		         break;
		         
		case"d": System.out.println("Enter ISBN number");
		         String isbn1 = sc.nextLine();
		         libMng.searchByIsbn(isbn1);
		         break;
		         
		case"e": libMng.displayAllBooks();
				 break;
				 
		case"3": System.out.println("Enter ISBN number to update details of book");
		         String isbn2 = sc.nextLine();
		         System.out.println("Enter the details to update");
		         System.out.println("Enter title");
		         String title2 = sc.nextLine();
		         System.out.println("Enter author");
		         String author2 = sc.nextLine();
		         System.out.println("Enter publication year");
		         int publishyear1 = sc.nextInt();
		         sc.nextLine();
		         libMng.updateBookDetails(author2,isbn2,title2,publishyear1);
		         break;
		      
		case"4": System.out.println("Enter ISBN number");
		         String isbn3 = sc.nextLine();
		         libMng.deleteBookDetails(isbn3);
		         break;
		         
		case"5": System.exit(0);
		         
		default: System.out.println("Enter valid choice");
		         
				 
		
		        
		        
		}       
			
		}
	}
}
