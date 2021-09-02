package controller;

import java.util.Scanner;

import service.impl.BusinessUnitServiceImpl;
import service.impl.UserServiceImpl;
import view.UserView;

public class TradeSystemController {
	
	private BusinessUnitController bucontroller;
	private TradeController tcontroller;
	private UserView uview;
	private UserController usercontroller;
	Scanner in=new Scanner(System.in);
	
	
 public TradeSystemController(UserView uview,UserController usercontroller,BusinessUnitController bucontroller,TradeController tcontroller) {
	 this.uview = uview;
     this.usercontroller=usercontroller;
     this.bucontroller=bucontroller;
     this.tcontroller=tcontroller;
	}


public void displayAdminOptions() {
	uview.showAdminOptions();
	int admin_options=in.nextInt();
	switch(admin_options) {
	case 1:
	{
		bucontroller.addNewBusinessUnit();
		break;
	}
	case 2:
	{
		
		bucontroller.deleteBusinessUnit();
		break;
	}
	case 3:
	{
	
		usercontroller.deleteUser();
		break;
	}
	default:
		System.out.println("Enter valid option number");
		break;
	}
	
}
 
 public void displayUserOptions() {
		uview.showUserOptions();
		int user_options=in.nextInt();
		switch(user_options) {
		case 1:
		{
			usercontroller.associateWithBusinessUnit();
			break;
		}
		case 2:
		{
			//tcontroller.addTrade();
			tcontroller.addTrade();
			break;
		}
		case 3:
		{
			//tcontroller.deleteTrade();
			tcontroller.deleteTrade();
			break;
		}
		default:
			System.out.println("Enter valid option number");
			break;
		}
	}
}
