<!DOCTYPE html>
<html>

<body bgcolor ="pale blue">
<br><br><br>
<h1 align ="center">WELCOME TO KIMS HOSPITALS</h1>
<h2 align="center">PATIENT DETAILS</h2>
<br><br>
<h1 align="center"><a href="patientsignin.html">Signup</a>|<a href="patientsignin.html">Signin</a></h1>
<table border="1" cellpadding ="20" width="400" height = "200" align ="center"> 
<tr><td>patient name</td><td>patient age</td><td>patient gender</td><td>patient problem</td><td>patient username</td><td>patient password</td><td>acceptance</td><td>Action</td></tr>
<%@page import ="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/invictus_engineers1";
String username= "root";
String password= "Babu@2000";
 con=DriverManager.getConnection(url, username, password);
ps=con.prepareStatement("select * from patient");
ResultSet rs=ps.executeQuery();
while(rs.next()){  

%>
<tr>
<td><%=rs.getString(1) %></td><td><%=rs.getInt(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td><td><%=rs.getString(6) %></td><td><%=rs.getString(7) %></td>

</tr>
<%
}

%>

</table>
</body>
</html>