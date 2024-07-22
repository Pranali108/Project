package com.demo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 


public class Demo {

	String insert = "insert into tblemployee values(102,'pooja','Kolhapur',55000)";
	
	//String sql = "Insert INTO tblemployee (id, name, city, salary) VALUES ('102','Pooja','Pune',45000)";
	String url = "jdbc:mysql://localhost:3306/j55";
	String user = "root";
	String password = "1008";
	
	void dbOperation() throws SQLException
	{
		Connection con = DriverManager.getConnection(url, user, password);
		Statement  statement = con.createStatement();
		statement.executeUpdate(insert);
		System.out.println("Data inserted");
	}
}
