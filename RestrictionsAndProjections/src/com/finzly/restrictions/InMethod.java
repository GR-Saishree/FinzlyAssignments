package com.finzly.restrictions;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class InMethod {

		@SuppressWarnings({ "unchecked", "deprecation" })
		public static void main(String[] args) {
			
			SessionFactory sf = Config.getSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.in("id",1,2,3,4,5,6));
			
			
			List<Employee> list = criteria.list();
			System.out.println("If listed id is present in dB it will display");
			for(Employee emp: list) {
				System.out.println(emp);
			}
			
			session.close();
		}
	

}
