package view;

import java.util.Scanner;


public class UserView {
	String loginname;
	String pw;
	String isAdminUser;
public UserView(){}

	Scanner sc=new Scanner(System.in);
	

 public void showAdminOptions() {
	 System.out.println("Choose an option from 1-3:");
	 System.out.println(" 1. Add a Business Unit");
	 System.out.println(" 2. Delete a Business Unit");
	 System.out.println(" 3. Delete a user");	
	 
 }
 
 public void showUserOptions() {
	 System.out.println("Choose an option from 1-3:");
	 System.out.println(" 1. Associate with a Business Unit");
	 System.out.println(" 2. Add a Trade");
	 System.out.println(" 3. Delete a trade");	 
 }
 
 

}
