package AdvancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/invictus_engineers";
		String username="root";
		String password="Babu@2000";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection established");
		
		PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?)");
		ps.setInt(1, 1023);
		ps.setString(2, "Narendra");
		ps.setInt(3, 70000);
		ps.setString(4, "Delhi");
		
		ps.setInt(1, 1024);
		ps.setString(2, "Ashok");
		ps.setInt(3, 70000);
		ps.setString(4, "pune");
		
		ps.setInt(1, 1025);
		ps.setString(2, "praveen");
		ps.setInt(3, 68000);
		ps.setString(4, "mumbai");
			
		ps.setInt(1, 1027);
		ps.setString(2, "Rasheed");
		ps.setInt(3, 78000);
		ps.setString(4, "hyderabad");
		
		
		int x=ps.executeUpdate();
		if(x!=0)
			System.out.println("Record inserted");
	}

}
