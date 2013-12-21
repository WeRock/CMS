package com.sandeep.core;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class AbstractJDBCConnector {
	
	String DB_DRIVER;
	String DB_URL;
	Connection connection;
	protected abstract void setConnection() throws SQLException, ClassNotFoundException;
	
	protected abstract Connection getConnection();
	
	protected abstract void setDriver();
	
	protected abstract void setDatabaseURL();

}
