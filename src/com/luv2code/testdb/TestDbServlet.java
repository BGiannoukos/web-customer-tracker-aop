package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user="root";
		String pass="GATE7!!!";
		String jdbcUrl = "jdbc:mysql://localhost/hb_student_tracker2?useUnicode=true&useJDBCCompliantTimezoneShift"
				+ "=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			System.out.println("connection to database");
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("connection successful");
		}catch(Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
		}

}
