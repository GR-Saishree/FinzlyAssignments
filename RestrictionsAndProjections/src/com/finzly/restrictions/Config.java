package com.finzly.restrictions;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class Config {

	private Config() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
		
	}
}
