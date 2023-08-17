package com.dl.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg1 {
	 static Connection connection=null;
	 static Statement createStatement=null;

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcstatements?autoReconnect=true&useSSL=false", "root", "Rakesh@9966");
		   createStatement =  connection.createStatement();
		     
			
			String s1 = "insert into emp(e_no,e_name,e_address,e_contact)values(101,'Rakesh','hyd',98765432)";
			String s2 = "insert into emp(e_no,e_name,e_address,e_contact)values(102,'Rajesh','knl',95265432)";
			String s3 = "insert into emp(e_no,e_name,e_address,e_contact)values(103,'Gana','blr',8741255425)";
			String s4 = "insert into emp(e_no,e_name,e_address,e_contact)values(104,'nikil','koti',8412545574)";
			String s5 = "insert into emp(e_no,e_name,e_address,e_contact)values(105,'manish','hyd',74122358963)";
			String s6 = "insert into emp(e_no,e_name,e_address,e_contact)values(106,'jp','str',9865765432)";
			
			createStatement.addBatch(s1);
			createStatement.addBatch(s2);
			createStatement.addBatch(s3);
			createStatement.addBatch(s4);
			createStatement.addBatch(s5);
			createStatement.addBatch(s6);
			
			int[] executeBatch = createStatement.executeBatch();
			for(int i :executeBatch ) {
				System.out.println("mutilple record inserted" + i);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			createStatement.close();
			connection.close();
		}

	}

}
