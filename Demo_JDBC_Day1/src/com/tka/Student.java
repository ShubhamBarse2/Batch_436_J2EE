package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Add jar
		// register & load Driver class

		Class.forName("com.mysql.cj.jdbc.Driver");

		// build Connection using DriverManager

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");

		// used statement & PreparedStatment

		Statement s = c.createStatement();

		// Execute Query

		int checked = s.executeUpdate("insert into student(id,name,city)values(123,'ram','pune')");
//		int checked = s.executeUpdate("update student set name='ramesh',city = 'nsk' where id = 123");
//		int checked = s.executeUpdate("delete from student where id = 123");
		
		if (checked > 0) {
			System.out.println("registration successfully...!");
		} else {
			System.err.println("registration Failed ...!");
		}

//		close all connection

		c.close();

	}

}
