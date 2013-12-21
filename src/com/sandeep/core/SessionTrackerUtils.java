package com.sandeep.core;

public class SessionTrackerUtils {
	
	SessionTracker session = SessionTracker.getInstance();
	
	public void put(String userid, User user)
	{
		session.put(userid, user);
	}
	public User get(String userid)
	{
		return session.get(userid);
	}

}
