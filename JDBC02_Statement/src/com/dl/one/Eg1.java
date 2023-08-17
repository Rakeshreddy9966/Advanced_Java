package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
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
		String query = "create table emp(e_no int,e_name varchar(45),e_address varchar(255),e_contact double)";
		
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
