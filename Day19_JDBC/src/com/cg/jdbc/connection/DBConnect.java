package com.cg.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) throws SQLException {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		// to connect eclipse with mysql server
		String dbURL ="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername ="root";
		String  dbPassword ="Single@12345";
		//query to retrieve data from table
		String query ="SELECT * FROM STUDENT";
		//for handling exception in driver block,catch block used
		//if driver class name is incorrect then it will throw an exception
		try
		{
			Class.forName(dbDriver);//dbDriver=driver name
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();//it will help to trace string with error/exception
		}
		//try-catch block to handle exception if given pass/user name/url is wrong
		try
		{
		//connection class to make connection between mysql and eclipse
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//statement class to execute queries and return result
		//createStatement
		Statement s= c.createStatement();
		ResultSet r= s.executeQuery(query);
		while (r.next())//rows
		 {
			String data="";
			for (int i=1;i<=2;i++)//columns
			{
				data=data+" "+r.getString(i);
				
			}
			System.out.println(data);
		 }
		}	

	
catch (SQLException e)
   {
	System.out.println("invalid url/username/password");
	e.printStackTrace();
   }
}

		

	

}
