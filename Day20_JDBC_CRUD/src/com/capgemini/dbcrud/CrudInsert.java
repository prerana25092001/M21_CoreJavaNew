package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudInsert {

	public static void main(String[] args) throws SQLException {
		String dbURL ="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername ="root";
		String  dbPassword ="Single@12345";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query="INSERT INTO EMPLOYEE(ID,NAME,EMAIL_TD,PASSWORD)VALUES(?,?,?,?)";
       //prepared statement used to pre compile sql queries
        PreparedStatement p=c.prepareStatement(query);
        p.setInt(1, 121);//id
        //p.setInt(1, 13);
        p.setString(2, "john");//name
        //p.setString(2, "jenny");
        p.setString(3, "john@gmail.com");//email
        //p.setString(3, "jenny@gmail.com");
        p.setString(4, "john@123");
       // p.setString(4, "jenny");//password
        int r=p.executeUpdate();
        //if rpow is>0 means no of rows are present
        if(r>0)
        {
        	System.out.println("A new user is inserted successfully");
        	
        }
        	c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
