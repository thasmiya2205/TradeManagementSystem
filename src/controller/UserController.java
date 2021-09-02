package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


import model.Trade;
import model.User;

import service.impl.BusinessUnitServiceImpl;
import service.impl.UserServiceImpl;
import view.UserView;

public class UserController {
	
	private UserServiceImpl userserviceimpl;
	
	int a;
	int b;
	int c;
	String bu_view_trades;
	String tradename;
	String business_unit_name;
	String del_bu_name;
	boolean is_bu_present;
	
	
	
	public UserController() {}
	
	public UserController(UserServiceImpl userserviceimpl) {

		this.userserviceimpl=userserviceimpl;
	}

	
	


public void deleteUser() {
	//call deleteUser() from UserService
	userserviceimpl.deleteUser();
	
}



	public void associateWithBusinessUnit() {
		
		userserviceimpl.associateWithBusinessUnit();
	
	}



	
}

