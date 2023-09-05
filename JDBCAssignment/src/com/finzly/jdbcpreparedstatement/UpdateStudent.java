package com.finzly.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		
		String query="update student set name=?, age=? where id=?";
		
		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url, user, password);
		    
			
			PreparedStatement st=c.prepareStatement(query);
			
			st.setString(1, "raghu");
			st.setInt(2, 20);
			st.setInt(3, 5);
		    st.execute();
		    
		    c.close();
		    
		    System.out.println("Student data updated");
		
		
	}
}
