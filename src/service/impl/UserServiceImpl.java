package service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import controller.TradeSystemController;
import model.Trade;
import model.User;
import model.UserEnum;
import service.UserService;
import view.UserView;

public class UserServiceImpl implements UserService{
	int a;
	int b;
	int c;
	String del_user;
	String bu_view_trades;
	String business_unit_name;
	boolean is_bu_present;
	private TradeSystemController tscontroller;
	Scanner in=new Scanner(System.in);
	
	UserView uview=new UserView();
	
	
	public UserServiceImpl() {}
	
	
	UserView userview=new UserView();


	@Override
	public void associateWithBusinessUnit() {
		 HashMap<String,List<String>> tempmap=new HashMap<String,List<String>>();
		 List<String> trades=new ArrayList<String>();
		 c=1;
		System.out.println("Enter the BusinessUnit you want to associate with:");
		business_unit_name=in.next();
		System.out.println("Enter the Trades with the BusinessUnit:");
		Trade trade=new Trade();
		while(c==1) {
		trade.setTrade_name(in.next());
		
		trades.add(trade.getTrade_name());
		c=0;
		System.out.println("Enter 1 to add another trade");
		c=in.nextInt();
		
		}
		System.out.println(business_unit_name);
		System.out.println(trades);
		tempmap.put(business_unit_name, trades);
		tempmap.forEach((key,value)->{
			System.out.println("business unit: "+key);
			System.out.println("Trade :"+value);
		});
		
		
		//press 1 to return to home
		//press 2 to view list
		
		System.out.println("Enter 1 to return to home");
		System.out.println("Enter 2 to view the associations");
		System.out.println("Enter 3 to view the trades maintained with a business unit");
		
		a=in.nextInt();
			
			if(a==1) {
				tscontroller.displayUserOptions();
			}
			if(a==2) {
				tempmap.forEach((key,value)->{
					System.out.println("business unit: "+key);
					System.out.println("Trade :"+value);
				});
			}
			if(a==3)
			{
				System.out.println("enter business unit name");
				bu_view_trades=in.next();
				is_bu_present=tempmap.containsKey(bu_view_trades);
				if(!is_bu_present) {
					System.out.println("Unauthorized access! Please enter an associated business unit name");
					//displayUserOptions();
				}
			
				System.out.println(tempmap.get(bu_view_trades));
				
				
			}
		
	}




	@Override
	public void deleteUser() {
		System.out.println("Enter the user to be deleted:");
		del_user=in.next();
		List<User> users=new ArrayList<User>();
		for (UserEnum e : Arrays.asList(UserEnum.values())) {
	        User user=new User(e.getUsername(),e.getPassword(),e.isAdmin(),e.isDeleted());
	        users.add(user);
	    }
		
	for(User u:users) {
		if(del_user.equals(u.getUsername())) {
			u.setDeleted(true);
			System.out.println(u.getUsername()+" is deleted:"+u.isDeleted());
			break;
		}
	}
		
		
		
	}

}
