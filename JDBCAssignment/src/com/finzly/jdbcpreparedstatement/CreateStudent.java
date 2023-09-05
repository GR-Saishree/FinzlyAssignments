package com.finzly.jdbcpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.finzly.jdbcstatement.DuplicateEntryException;

import java.sql.PreparedStatement;

public class CreateStudent {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		
		String query="insert into student (id,name,age) values(?,?,?)";
		
		
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url, user, password);
		    
			
			PreparedStatement st=c.prepareStatement(query);
			st.setInt(1, 7);
			st.setString(2, "vishnu");
			st.setInt(3, 19);
			try {
				 st.execute();
			}
			catch(SQLException e) {
				if(e.getErrorCode()==1062) {
					throw new DuplicateEntryException("Duplicate entry is found");
				}
				else {
					e.printStackTrace();
				}
			}
		    c.close();
		    
		    System.out.println("Student data saved");
		    
	}
	catch(DuplicateEntryException e) {
		System.out.println(e.getMessage());
	}
		
		
	}

}
