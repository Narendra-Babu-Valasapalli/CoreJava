<!DOCTYPE html>
<html>

<body bgcolor ="pale blue">
<br><br><br>
<h1 align ="center">WELCOME TO KIMS HOSPITALS</h1>
<h2 align="center">DOCTOR DETAILS</h2>
<br><br>
<h1 align="center"><a href="doctorsignin.html">Signup</a>|<a href="doctorsignin.html">Signin</a></h1>
<table border="1" cellpadding ="20" width="400" height = "200" align ="center"> 
<tr><td>Doctor name</td><td>Doctor specialization</td><td>Doctor roomno</td><td>Doctor mailpassword</td><td>Doctor username</td><td>Action</td></tr>
<%@page import ="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/invictus_engineers1";
String username= "root";
String password= "Babu@2000";
 con=DriverManager.getConnection(url, username, password);
ps=con.prepareStatement("select * from doctor");
ResultSet rs=ps.executeQuery();
while(rs.next()){  

%>
<tr>
<td><%=rs.getString(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getInt(3) %></td><td><%=rs.getInt(4) %></td><td><%=rs.getString(5) %></td>


</tr>
<%
}

%>

</table>
</body>
</html>