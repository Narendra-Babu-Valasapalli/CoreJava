package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Patient extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;

	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/invictus_engineers1";
			String username= "root";
			String password= "Babu@2000";
			 con=DriverManager.getConnection(url, username, password);
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		int ag=Integer.parseInt(age);
		String gender=request.getParameter("gender");
		String problem=request.getParameter("problem");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int pass=Integer.parseInt(password);
		try {
			ps=con.prepareStatement("insert into patient values(?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, ag);
			ps.setString(3,gender);
			ps.setString(4, problem);
			ps.setString(5, username);
			ps.setInt(6, pass);
			ps.setString(7, "pending");
			int x= ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("./index.html?msg=Added Successfully");
			
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
