package com.sandeep.core;

import java.util.HashMap;

public class SessionTracker {

	HashMap<String,User> users= new HashMap<String,User>();
	
	/* Singleton Class to limit the no of instances to one */
	
	static SessionTracker tracker=new SessionTracker();
	protected void put(String userid,User user)
	{
		users.put(userid, user);
	}
	protected User get(String userid)
	{
		return users.get(userid);
	}
	protected static SessionTracker getInstance()
	{
		return tracker;
	}
	private SessionTracker()
	{
		
	}
}
