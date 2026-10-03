package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

//	get --> doGet
//	post --> doPost

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");

		String id = req.getParameter("employeeId");
		int empId = Integer.parseInt(id);

		String city = req.getParameter("city");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
			PreparedStatement ps = c
					.prepareStatement("insert into employee(name,id,city,email,password)values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, empId);
			ps.setString(3, city);
			ps.setString(4, email);
			ps.setString(5, pass);
			int checked = ps.executeUpdate();

			if (checked > 0) {

				out.print("<h1 style='color:green'> Registration Successfully ...! </h1>");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				rd.include(req, resp);
//				rd.forward(req, resp);

				System.out.println("inserted");
			} else {

				out.print("<h1 style='color:red'> Registration Failed  ...! </h1>");

				System.out.println("failed");
				RequestDispatcher rd = req.getRequestDispatcher("home.html");
				rd.include(req, resp);
			}

		} catch (Exception e) {

		}

	}
}
