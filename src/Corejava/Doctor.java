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

public class Doctor extends HttpServlet {
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
		String specialization=request.getParameter("specialization");
		String roomno=request.getParameter("roomno");
		int rm=Integer.parseInt(roomno);
		String mailpassword=request.getParameter("mailpassword");
		int pass=Integer.parseInt(mailpassword);
		String username=request.getParameter("username");
		try {
			ps=con.prepareStatement("insert into doctor values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2,specialization);
			ps.setInt(3,rm);
			ps.setInt(4, pass);
			ps.setString(5, username);
			int x= ps.executeUpdate();
			if(x!=0)
				response.sendRedirect("./index.html?msg=Added Successfully");
			
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
