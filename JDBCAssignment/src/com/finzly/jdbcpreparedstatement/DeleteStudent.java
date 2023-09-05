package com.finzly.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		
		String query="delete from student where id=?";
		
		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url, user, password);
		    
			
			PreparedStatement st=c.prepareStatement(query);
			st.setInt(1, 2);
			st.execute();
			
		    
		    
		    c.close();
		    
		    System.out.println("Student data deleted");
		
		
	}
}
