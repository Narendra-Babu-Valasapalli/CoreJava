<!DOCTYPE html>
<html>
<body bgcolor="#E94CEE " ><br>

<h1 align="center"  style="color:#45F02A">
<a href="index.html" >Log Out</a>
</h1>

<h1 align ="center" style="color:#0C0C0C ">Appointment List</h1>
<br><br>	
<table border= "1" cellpadding="20" width="90%" height= "100" align="center">
<tr>
<td><h2>Name</h2></td><td><h2>age</h2></td><td><h2>gender</h2></td>
<td><h2>appointment_purpose</h2></td><td><h2>appointment_Status</h2></td><td><h2>Present_Status</h2></td>
</tr>
<%@page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/invictus_engineers1";     
String username= "root";
String password= "Babu@2000";
con=DriverManager.getConnection(url, username, password);
ps = con.prepareStatement("select * from appointment");
ResultSet ns = ps.executeQuery();
while(ns.next()){
%> 
<tr>
<td><%=ns.getString(1)%></td><td><%=ns.getInt(2)%></td><td><%=ns.getString(3)%></td>
<td><%=ns.getString(4)%></td><td><%=ns.getString(5)%></td>
<td><a href="doctoraccept.jsp?na=<%=ns.getString(1)%>">Accept | </a><a href="doctorreject.jsp?na=<%=ns.getString(1)%>">Reject</a></td>
</tr>
<%} %>
</table>
</body>
</html>