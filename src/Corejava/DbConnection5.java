package AdvancedJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/invictus_engineers";
		String username="root";
		String password="Babu@2000";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection established");
		
		PreparedStatement ps = con.prepareStatement("select 60+40 addition ");
		PreparedStatement ps1 = con.prepareStatement("select 60-40 substraction");
		PreparedStatement ps2 = con.prepareStatement("select 60*40 multplication");
		PreparedStatement ps3 = con.prepareStatement("select 60%40 division");
		
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println("=============");
		}
		ResultSet rs1=ps1.executeQuery();
		while (rs1.next()) {
			System.out.println(rs1.getInt(1));
			System.out.println("=============");
		}
		ResultSet rs2=ps2.executeQuery();
		while (rs2.next()) {
			System.out.println(rs2.getInt(1));
			System.out.println("=============");
		}
		ResultSet rs3=ps3.executeQuery();
		while (rs3.next()) {
			System.out.println(rs3.getInt(1));
		}
		
}
}

