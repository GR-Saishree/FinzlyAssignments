package com.finzly.jdbcstatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetStudents {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		

		
				String url="jdbc:mysql://localhost:3306/jdbc";
				String user="root";
				String password="yashu@632";
				String query="select * from student";
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection c= DriverManager.getConnection(url,user,password);
				
				    Statement st= c.createStatement();
				    
				    ResultSet rs=st.executeQuery(query);
				    while(rs.next()) {
				    	
				    System.out.println("Id = "+rs.getInt(1));
				    System.out.println("Name = "+rs.getString(2));
				    System.out.println("Age = "+rs.getInt(3));
				    System.out.println("****************************");
				    }
				    c.close();
				    System.out.println("All the details are fetched");
				   
			
			}
			
			

		

}

