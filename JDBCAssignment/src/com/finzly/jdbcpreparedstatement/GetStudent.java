package com.finzly.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetStudent {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		
		String query="select * from student where id=?";
		
		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url, user, password);
		    
			
			PreparedStatement st=c.prepareStatement(query);
			st.setInt(1, 1);
			ResultSet rs = st.executeQuery();
			
		    if(rs.next()) {
		    	System.out.println("Id = "+rs.getInt(1));
			    System.out.println("Name = "+rs.getString(2));
			    System.out.println("Age = "+rs.getInt(3));
			    System.out.println("****************************");
		    }
		    
		    c.close();
		    
		    System.out.println("Student data displayed");
		
		
	}
}
