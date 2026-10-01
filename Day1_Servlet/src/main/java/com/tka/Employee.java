package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Employee extends HttpServlet {

//	get --> doGet
//	post --> doPost

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");

		String age1 = req.getParameter("age");
		int age = Integer.parseInt(age1);

		String city = req.getParameter("city");

		String salary1 = req.getParameter("salary");
		double salary = Double.parseDouble(salary1);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
			PreparedStatement ps = c.prepareStatement("insert into employee(name,age,city,salary)values(?,?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, city);
			ps.setDouble(4, salary);
			int checked = ps.executeUpdate();

			if (checked > 0) {

				out.print("<h1 style='color:green'> Registration Successfully ...! </h1>");

				System.out.println("inserted");
			} else {
				
				out.print("<h1 style='color:red'> Registration Failed  ...! </h1>");
				
				System.out.println("failed");
			}

		} catch (Exception e) {

		}

	}
}
