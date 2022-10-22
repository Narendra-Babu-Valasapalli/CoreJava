package AdvancedJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbConnection4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/invictus_engineers";
		String username="root";
		String password="Babu@2000";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection established");
		
		PreparedStatement ps = con.prepareStatement("select * from employee order by name");
		
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getString("name")+"   "+rs.getInt("salary")+"    "+rs.getString(4));
		}
		
}
}
