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

public class patient1 extends HttpServlet {
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
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int pass=Integer.parseInt(password);
		try {
			ps=con.prepareStatement("select * from patient where username=? and password=?");
			ps.setString(1, username);
			ps.setInt(2, pass);
			
			ResultSet ns=ps.executeQuery();
			
			if(ns.next()) {
				response.sendRedirect("./patientprofile.html?msg=signin Successfully");
			}else {
			response.sendRedirect("./patientsignin.html?msg=signin failed");
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
