package com.diworksdev.webproj4.dto;

public class HelloStrutsDTO {
	private int userId;
	private String username;
	private String password;
	private String result;

	public int getUserId(){
		return userId;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public String getUserName(){
		return username;
	}

	public void setUserName(String userName){
		this.username = userName;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getResult(){
		return result;
	}

	public void setResult(String result){
		this.result = result;
	}
}
