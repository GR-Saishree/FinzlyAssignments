package com.finzly.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudent {

	
	public static void main(String[] args) throws ClassNotFoundException,SQLException, DuplicateEntryException {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		
		String query="insert into student values(4,'srivalli',17)";
		try {
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url, user, password);
		    
			
			Statement st=c.createStatement();
			try {
				 st.execute(query);
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


