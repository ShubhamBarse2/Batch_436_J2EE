package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pojo.Student;

public class StudentDao {

//	Db Connection code 

	public void insertData(Student std) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		PreparedStatement s = c.prepareStatement("insert into student(id,name,city)values(?,?,?)");
		s.setInt(1, std.getId());
		s.setString(2, std.getName());
		s.setString(3, std.getCity());

		int checked = s.executeUpdate();

		if (checked > 0) {
			System.out.println("Successfully register");
		} else {
			System.out.println("Failed");
		}

	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		PreparedStatement ps = c.prepareStatement("update student set name=?,city = ? where id = ?");
		ps.setInt(1, 123);
		ps.setString(2, "ram");
		ps.setString(3, "nsk");

		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("updated");
		} else {
			System.out.println("Failed");
		}
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from student where id = ?");
		ps.setInt(1, 123);

		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("Deleted ");
		} else {
			System.out.println("Failed");
		}

	}

	public void fetchData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		PreparedStatement ps = c.prepareStatement("SELECT * from student");
		ResultSet r = ps.executeQuery();

		while (r.next()) {
			System.out
					.println("ID --> " + r.getInt(1) + " name -->  " + r.getString(2) + " city --> " + r.getString(3));
		}

	}

	public void deleteTable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
		Statement s = c.createStatement();
		boolean isDlt = s.execute("drop table student");

		if (isDlt) {
			System.out.println("table deleted ");
		} else {
			System.out.println("Not Dlt");
		}

		s.close();
	}

}
