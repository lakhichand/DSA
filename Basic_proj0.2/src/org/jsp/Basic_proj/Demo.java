package org.jsp.Basic_proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loadead and registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Lucky");
			System.out.println("Establish Connection Between Java Application And Database Server");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Close All The Clostly resoursese");
		}
	}
}
