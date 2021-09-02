package main;

import java.util.*;

import controller.BusinessUnitController;
import controller.TradeController;
import controller.TradeSystemController;
import controller.UserController;
import model.BusinessUnit;
import model.User;
import model.UserEnum;
import service.BusinessUnitService;
import service.impl.BusinessUnitServiceImpl;
import service.impl.TradeServiceImpl;
import service.impl.UserServiceImpl;
import view.UserView;

public class TradeManagement {
public static void main(String[] args) {
	 String loginname;
     String pw;
	 String isAdminUser;
	 User loggedinuser;
	 
	 
	UserView uview=new UserView();
	

	
	Thread t=new Thread(new BusinessUnitThread());
	Thread t2=new Thread(new TradeThread());
    







	Scanner sc=new Scanner(System.in);
	

	System.out.println("    LOGIN   ");
	System.out.println("Enter the username:");
	loginname=sc.nextLine();
	System.out.println("Enter the password:");
	pw=sc.nextLine();

	
	
	List<User> users=new ArrayList<User>();
	for (UserEnum e : Arrays.asList(UserEnum.values())) {
        User user=new User(e.getUsername(),e.getPassword(),e.isAdmin(),e.isDeleted());
        users.add(user);
    }
	
for(User u:users) {
	if(loginname.equals(u.getUsername())&&(pw.equals(u.getPassword()))){
		loggedinuser=u;
		BusinessUnitServiceImpl bunitservice=new BusinessUnitServiceImpl(t);
		TradeServiceImpl tradeserviceimpl=new TradeServiceImpl(t2);
		UserServiceImpl userserviceimpl=new UserServiceImpl();
		UserController ucontroller=new UserController(userserviceimpl);
		BusinessUnitController bucontroller=new BusinessUnitController(t,bunitservice);
		TradeController tcontroller=new TradeController(tradeserviceimpl);
		TradeSystemController tscontroller=new TradeSystemController(uview,ucontroller,bucontroller,tcontroller);		



		if(loggedinuser.isAdmin()) {
			tscontroller.displayAdminOptions();
			break;
		}
		tscontroller.displayUserOptions();
		break;
	}
		
	}
System.out.println("Invalid Login Credentials");
}
	

	}



	


