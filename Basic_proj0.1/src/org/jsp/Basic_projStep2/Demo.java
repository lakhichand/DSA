package org.jsp.Basic_projStep2;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Demo {

	public static void main(String[] args) {
		
		Connection con =  null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user =root&password=Lucky")
					System.out.println("Establish onnection between java application and the database server");
		} catch (ClassNotFoundException e |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				
			}
		}
	}
}
