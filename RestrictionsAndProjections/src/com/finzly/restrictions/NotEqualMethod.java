package com.finzly.restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class NotEqualMethod {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("name", "Sai shree"));
		
		List<Employee> list = criteria.list();
		System.out.println("Employees not having name Sai shree");
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		session.close();
	}
}
