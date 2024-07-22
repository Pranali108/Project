package com.example.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.integration.c3p0.MysqlConnectionTester;

public class Test {
	
	public static void main(String[] args){
		
		String user = "root";
		String pass = "1234";
		String url = "jdbc:mysql://localhost:3306/emp"; 
		try {
		//Connection con = DriverManager.getConnection(url, user, "");
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Hello connection done");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("sql exception");
		}
		
		finally {
			
			System.out.println("connection close");
		}
	}

}
