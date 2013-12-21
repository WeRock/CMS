package com.sandeep.actions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.sandeep.core.MySqlJDBCConnector;

public class AuthenticateUser {
	
	private HashMap<String,String> map;
	public boolean getAuthenticationStatus()
	{
		if(isAuthenticated())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private boolean isAuthenticated()
	{
		try {
			
			MySqlJDBCConnector connector;			
			connector = new MySqlJDBCConnector();
			Connection connection= connector.getConnection();
			Statement stmt = connection.createStatement();
			String query="select count(*) from cms_users where name='"+map.get("username")+"' and password='"+map.get("password")+"'";
			ResultSet rs= stmt.executeQuery(query);
			rs.next();
			if(rs.getInt(1)==1)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public AuthenticateUser(HashMap<String,String> map) {
		// TODO Auto-generated constructor stub
		this.map=map;
	}

}
