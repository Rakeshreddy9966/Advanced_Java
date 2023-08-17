package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eg1 {
	
	static Connection connection  = null;
	static PreparedStatement prepareStatement = null;

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcstatements?autoReconnect=true&useSSL=false", "root", "Rakesh@9966");
			
			String query = "insert into emp values(?, ?, ?, ?)";
		    prepareStatement = connection.prepareStatement(query);
			
			prepareStatement.setInt(1, 101);
			prepareStatement.setString(2, "Sai Kiran");
			prepareStatement.setString(3, "Hyd");
			prepareStatement.setLong(4, 9876543210L);
			prepareStatement.addBatch();
			
			prepareStatement.setInt(1, 102);
			prepareStatement.setString(2, "Sai Kumar");
			prepareStatement.setString(3, "Hyd");
			prepareStatement.setLong(4, 9876543210L);
			prepareStatement.addBatch();
			
			prepareStatement.setInt(1, 103);
			prepareStatement.setString(2, "Sai Ram");
			prepareStatement.setString(3, "Hyd");
			prepareStatement.setLong(4, 9876543210L);
			prepareStatement.addBatch();
			
			int[] executeBatch = prepareStatement.executeBatch();
			for (int i : executeBatch) {
				System.out.println("Record Inserted: " + i);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		finally {
			prepareStatement.close();
			connection.close();
		}

	}

}
