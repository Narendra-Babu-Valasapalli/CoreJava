package com.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Doctor1 extends HttpServlet {
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
		
		String password=request.getParameter("mailpassword");
		int pass=Integer.parseInt(password);
		String username=request.getParameter("username");
		try {
			ps=con.prepareStatement("select * from doctor where  mailpassword=? and username=?");
			ps.setInt(1, pass);
			ps.setString(2,username);
			
			
			ResultSet ns=ps.executeQuery();
			
			if(ns.next()) {
				response.sendRedirect("./doctorprofile.html?msg=signin Successfully");
			}else {
			response.sendRedirect("./doctorsignin.html?msg=signin failed");
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
