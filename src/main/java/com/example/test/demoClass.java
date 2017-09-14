package com.example.test;

import java.io.IOException;
import java.sql.*;

import javax.servlet.http.HttpServletResponse;

public class demoClass {
public void jdbc(HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException
{
	String url="jdbc:mysql://mysql:3306/sampledb";
	String uname="user";
	String pass="password";
	String query="SELECT * FROM potluck";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn= DriverManager.getConnection(url,uname,pass);
	Statement stmt = conn.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next())
	{
	String name=rs.getString("name");
	String food=rs.getString("food");
	response.getWriter().append("the name of food is ").append(name).append("With the value").append(food).append("</br>");
	
	}
	
}
}
