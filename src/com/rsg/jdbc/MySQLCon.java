package com.rsg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLCon {

	public static void main(String[] args) {
		try {
		//step1 load the driver class  
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2 create  the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "password");
		
		//step3 create the statement object  
		Statement stmt = con.createStatement();
		
		//step4 execute query  
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
		}
		
		//step5 close the connection object  
		con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
