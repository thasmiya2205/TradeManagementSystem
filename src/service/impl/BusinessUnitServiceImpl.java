package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.UserController;
import model.BusinessUnit;
import model.User;
import service.BusinessUnitService;

public class BusinessUnitServiceImpl implements BusinessUnitService{
private UserController usercontroller;
int a;
int id;
String name;
private Thread t;
Scanner in=new Scanner(System.in);

public BusinessUnitServiceImpl(){}

public BusinessUnitServiceImpl(Thread t)
{
this.t=t;
}


	@Override
	public void addBusinessUnit() {
		t.start();

	}



	@Override
	public boolean deleteBusinessUnit(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
