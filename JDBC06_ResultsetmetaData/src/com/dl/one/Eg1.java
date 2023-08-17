package com.dl.one;

public class Eg1 {
	
	//Result set meta data:-column name,column size,data type
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			DriverManger.getConnection("jdbc:mysql://localhost:3306/jdbcstatements?autoReconnect=true&useSSL=false", "root", "Rakesh@9966");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
