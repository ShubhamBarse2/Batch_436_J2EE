package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch436", "root", "root");
			PreparedStatement ps = c.prepareStatement("select * from employee where email =? and password=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Login successfully ...!");
				out.print("Login successfully ...!");

				HttpSession session = req.getSession();
				session.setAttribute("Name", rs.getString("name"));
				session.setAttribute("ID", rs.getString("id"));
				session.setAttribute("City", rs.getString(3));
				session.setAttribute("Email", rs.getString(4));

				RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
				rd.include(req, resp);

			} else {
				System.out.println("Failed");
				out.println("Failed");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				rd.include(req, resp);
			}

		} catch (Exception e) {

		}

	}
}
