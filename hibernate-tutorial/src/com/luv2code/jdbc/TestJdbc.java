package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestJdbc {

	public static void main(String[] args) {
		try {
			String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
			String usr = "hbstudent";
			String pass = "hbstudent";
			
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl, usr, pass);
			System.out.println("Connection Successful!!!");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
