package org.jsp.InsertDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String Qry1 = "insert into btm.student values(1 ,'lucky',75.80)";
		String Qry2 = "insert into btm.student values(2 ,'harshal',70.80)";
		String Qry3 = "insert into btm.student values(3 ,'akshay',60.80)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver calss loaded And registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Lucky");
			System.out.println("Established connection with The database");
			stmt = con.createStatement();
			System.out.println("Platforn Created");
			stmt.executeUpdate(Qry1);
			stmt.executeUpdate(Qry2);
			stmt.executeUpdate(Qry3);
			
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
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Costly resoursese close");
		}
	}
}
