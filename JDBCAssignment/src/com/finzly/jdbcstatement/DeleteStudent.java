package com.finzly.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		
		String query="delete from student where id=3";
		
		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url, user, password);
		    
			
			Statement st=c.createStatement();
		    st.execute(query);
		    
		    c.close();
		    
		    System.out.println("Student data deleted");
		
		
	}
	
	
}
