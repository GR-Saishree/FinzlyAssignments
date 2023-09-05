package com.finzly.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="yashu@632";
		String query="update student set name='usha', age=18 where id=4";
		
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c= DriverManager.getConnection(url,user,password);
		
		    Statement st= c.createStatement();
		    
		    st.execute(query);
		    
		    System.out.println("Updated");
		    c.close();
		    
		
		
	}
}
