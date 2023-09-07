package com.finzly.librarymanagement;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

	
	private Config() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Books.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
		
	}
}
