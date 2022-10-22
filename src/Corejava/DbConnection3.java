package AdvancedJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/invictus_engineers";
		String username="root";
		String password="Babu@2000";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection established");
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
		ps.setInt(1,1027);
		int x=ps.executeUpdate();
		if(x!=0)
			System.out.println("Record deleted");


}
}