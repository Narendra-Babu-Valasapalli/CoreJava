 <%@page import ="java.sql.*" %>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/invictus_engineers1";
String username= "root";
String password= "Babu@2000";
 con=DriverManager.getConnection(url, username, password);
 String name  = request.getParameter("na");
ps=con.prepareStatement("update appointment set appointment_status=? where name=?");
ps.setString(1,"Accepted");
ps.setString(2,name);
int x= ps.executeUpdate();
if(x!=0)
response.sendRedirect("apppointment.jsp?msg=Accepted");
%>