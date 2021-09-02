package model;

import java.util.*;

public class User {
	
	private String username;
	private String password;
	private boolean isAdmin;
	private boolean isDeleted;
	
	public HashMap<String,List<Trade>> map;
	public User(String username, String password, boolean isAdmin, boolean isDeleted) {
		
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
		this.isDeleted = isDeleted;
		map=new HashMap<String,List<Trade>>();
	}
	
	public HashMap<String, List<Trade>> getMap() {
		return map;
	}

	public void setMap(HashMap<String, List<Trade>> map) {
		this.map = map;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	

}
