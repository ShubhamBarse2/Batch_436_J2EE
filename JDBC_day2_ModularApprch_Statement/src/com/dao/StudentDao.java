package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

//	Db Connection code 

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		Statement s = c.createStatement();
		int checked = s.executeUpdate("insert into student(id,name,city)values(123,'ram','pune')");

		if (checked > 0) {
			System.out.println("Successfully register");
		} else {
			System.out.println("Failed");
		}

	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		Statement s = c.createStatement();
		int checked = s.executeUpdate("update student set name='ramesh',city = 'nsk' where id = 123");

		if (checked > 0) {
			System.out.println("updated");
		} else {
			System.out.println("Failed");
		}
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		Statement s = c.createStatement();
		int checked = s.executeUpdate("delete from student where id = 123");

		if (checked > 0) {
			System.out.println("Deleted ");
		} else {
			System.out.println("Failed");
		}

	}

	public void fetchData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		Statement s = c.createStatement();

		ResultSet r = s.executeQuery("select * from student");

		while (r.next()) {
			System.out
					.println("ID --> " + r.getInt(1) + " name -->  " + r.getString(2) + " city --> " + r.getString(3));
		}

	}

}
