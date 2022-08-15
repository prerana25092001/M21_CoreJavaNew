package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDelete {

	public static void main(String[] args) {
		String dbURL ="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername ="root";
		String  dbPassword ="Single@12345";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query="DELETE FROM EMPLOYEE WHERE ID=?";
       //prepared statement used to pre compile sql queries
        PreparedStatement p=c.prepareStatement(query);
        p.setInt(1, 121);//id
        
        int r=p.executeUpdate();
        //if rpow is>0 means no of rows are present
        if(r>0)
        {
        	System.out.println("user deleted");
        	
        }
        	c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
