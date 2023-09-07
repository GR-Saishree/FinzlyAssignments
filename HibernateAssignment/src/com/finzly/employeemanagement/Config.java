package com.finzly.employeemanagement;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

		private Config() {
			
		}
		
		public static SessionFactory getSessionFactory() {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate1.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);
			SessionFactory sf = cfg.buildSessionFactory();
			return sf;
			
		}
}


