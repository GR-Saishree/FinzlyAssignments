package com.finzly.restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class GreaterThanEqualMethod {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		
		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.ge("salary", "50000"));
		
		
		List<Employee> list = criteria.list();
		System.out.println("Employees salary greater than and equal to 50000");
		for(Employee emp: list) {
			System.out.println(emp);
		}
		
		session.close();
	}
}
