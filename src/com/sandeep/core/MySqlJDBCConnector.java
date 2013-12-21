package com.sandeep.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySqlJDBCConnector extends AbstractJDBCConnector {

	private ResourceBundle bundle;
	@Override
	protected void setConnection() throws SQLException,ClassNotFoundException {
	
		Class.forName(DB_DRIVER);
		String username=bundle.getString("mysql.username");
		String password=bundle.getString("mysql.password");		
		connection= DriverManager.getConnection(DB_URL,username,password); 				
		
	}

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return connection;
	}

	@Override
	protected void setDriver() {
		
		DB_DRIVER=bundle.getString("mysql.driver");

	}

	@Override
	protected void setDatabaseURL() {

		DB_URL= bundle.getString("mysql.dburl");

	}
	public MySqlJDBCConnector() throws ClassNotFoundException, SQLException
	{
		bundle= ResourceBundle.getBundle("cms_resources");
		setDriver();
		setDatabaseURL();
		setConnection();
	}
}
