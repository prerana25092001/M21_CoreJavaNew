package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) throws SQLException {
		String dbURL ="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername ="root";
		String  dbPassword ="Single@12345";
		try
		{
		
		//to check whether eclipse is connected with mysql or not
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		if(c!= null)
		{
			System.out.println("connection established");
			//once connection started we need to close it
			c.close();
		}

	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
