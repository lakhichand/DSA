package org.jsp.Fetchadapp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchedDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id ???");
		int id = sc.nextInt();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select*from btm.student where id = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load and registered driver class");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Lucky");
			System.out.println("Established Connection wih database server");
			pstmt = con.prepareStatement(qry);
			System.out.println("Platform created");
			// set the data before the execution
			pstmt.setInt(1, id);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(2);
				double perc = rs.getDouble(3);
				System.out.println(name+ " "+perc);
			}
			else {
				System.out.println("no data found at id "+id+"");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
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
			System.out.println(" Close  all the costly resourses");
		}
	}
}
