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

public class Aappointment extends HttpServlet{
	Connection con = null;
	PreparedStatement ps = null;
	public void init(ServletConfig config) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/invictus_engineers1";
			String username= "root";
			String password= "Babu@2000";
			 con=DriverManager.getConnection(url, username, password);
			
			
		
		}
		catch(Exception ee){
			ee.printStackTrace();			
		}
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name  = request.getParameter("name");
		String age  = request.getParameter("age");
		int ag =Integer.parseInt(age);
		String gender = request.getParameter("gender");
		String appointmentpurpose =request.getParameter("appointment_purpose");
	
	
		
		try {
			ps=con.prepareStatement("insert into appointment values(?,?,?,?,?)");
			
			ps.setString(1,name);
			ps.setInt(2, ag);
			ps.setString(3, gender);
			ps.setString(4, appointmentpurpose);
			ps.setString(5, "pending");
			
			int x=ps.executeUpdate();
			if(x!=0) {
				
				response.sendRedirect("./patientprofile.html?msg=Added succesfully");
			
		}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	
}