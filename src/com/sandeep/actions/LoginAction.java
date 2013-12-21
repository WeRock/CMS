package com.sandeep.actions;

import java.util.HashMap;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public String execute()
	{
		HashMap<String,String> map= new HashMap<String,String>();
		map.put("username", username);
		map.put("password", password);
		AuthenticateUser authenticate= new AuthenticateUser(map);
		if(authenticate.getAuthenticationStatus())
		{
			return "success";
		}
		else
		{
			addActionError("Invalid Username/password combination");
			return "failure";
		}
	}
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}

}
