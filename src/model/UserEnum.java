package model;


public enum UserEnum {
user1("Bruce Banner","mango",true,false),
user2("Pepper","orange",false,false),
user3("Tony Stark","apple",false,false);
	
String username;
String password;
boolean isAdmin;
boolean isDeleted;

UserEnum(String username, String password, boolean isAdmin, boolean isDeleted) {
	this.username=username;
	this.password=password;
	this.isAdmin=isAdmin;
	this.isDeleted=isDeleted;
}

public String getUsername() {
	return username;
}

public String getPassword() {
	return password;
}

public boolean isAdmin() {
	return isAdmin;
}

public boolean isDeleted() {
	return isDeleted;
}









}