package AdvancedJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbConnection12 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ hp_product1";
		String username="root";
		String password="Babu@2000";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection established");
		
		PreparedStatement ps = con.prepareStatement("select pid,pname,price,id,quantity,location from product1 d inner join order1 o on d.pid=o.opid;");
		
		
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getInt(3)+"    "+rs.getInt(4)+"    "+rs.getInt(5)+"    "+rs.getString(6));
		}

	}	


}
