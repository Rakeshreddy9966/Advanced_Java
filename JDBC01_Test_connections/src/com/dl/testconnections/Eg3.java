package com.dl.testconnections;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg3 {

	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcstatements?autoReconnect=true&useSSL=false", "root", "Rakesh@9966");
			System.out.println("Database connected");
		} catch (SQLException e) {
			
			System.out.println("catch" + e);
		}

	}

}
