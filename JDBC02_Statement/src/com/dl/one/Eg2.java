package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg2 {
//create table
	static Connection connection =null;
	static Statement createStatement = null;
	
	public static void main(String[] args) throws SQLException {
	try {
		//step 1 load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 create connection
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcstatements?autoReconnect=true&useSSL=false", "root", "Rakesh@9966");
		
		//create statement
		createStatement = connection.createStatement();
		String query = "insert into emp(e_no,e_name,e_address,e_contact)values(101,'Rakesh','hyd',98765432)";
		//execute the query
		
		int executeUpdate = createStatement.executeUpdate(query);
		System.out.println("Table created "+ executeUpdate);
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	}finally {
		
		createStatement.close();
		connection.close();
		}
	}

	
	

}
