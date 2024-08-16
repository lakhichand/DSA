package org.jsp.insertApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		//String qry = "insert into btm.student values(3,'Harshita' ,79.80)";
		//String qry = "Delete from btm.student where id = 1";
		String qry = "update btm.student set name='akshay' where id = 2";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Class loaded and Registred");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Lucky");
			System.out.println("Connection Established with the database server");
			stmt = con.createStatement();
			System.out.println("Platform Created!");
			stmt.executeUpdate(qry);
			System.out.println("Data Inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("close all the costly resourses !");
		}
	}
}
