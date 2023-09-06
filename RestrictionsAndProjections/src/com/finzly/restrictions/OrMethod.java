package com.finzly.restrictions;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class OrMethod {

		@SuppressWarnings({ "unchecked", "deprecation" })
		public static void main(String[] args) {
			
			SessionFactory sf = Config.getSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Employee.class);
			Criterion criterion1 = Restrictions.eq("salary","30000");
			Criterion criterion2 = Restrictions.eq("id",6);
			criteria.add(Restrictions.or(criterion1,criterion2));
			
			
			List<Employee> list = criteria.list();
			System.out.println("If salary is 30000 or id 6 then it displays");
			for(Employee emp: list) {
				System.out.println(emp);
			}
			
			session.close();
		}
	

}
