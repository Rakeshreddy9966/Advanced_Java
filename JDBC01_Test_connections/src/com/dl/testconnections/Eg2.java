package com.dl.testconnections;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg2 {
public static void main(String[] args) {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Device connected");
	} catch (SQLException e) {
		
		System.out.println("catch" +e);
	}
}
}
