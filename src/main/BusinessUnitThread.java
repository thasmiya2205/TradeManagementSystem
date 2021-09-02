package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.BusinessUnit;

public class BusinessUnitThread implements Runnable {
int id;
String name;
int a;
Scanner in=new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Enter business unit id");
		id=in.nextInt();
		System.out.println("Enter business unit name:");
		name=in.next();
		
		List<BusinessUnit> units=new ArrayList<BusinessUnit>();
		BusinessUnit unit=new BusinessUnit(id,name);
		units.add(unit);

		for(BusinessUnit i:units) {
			System.out.println(i.getUnit_id()+" "+i.getUnit_name());
			
		}

		//press 1 to return to home
		//press 2 to view list
		System.out.println("Enter 1 to return to home");
		System.out.println("Enter 2 to view the list of BusinessUnits");
		a=in.nextInt();
			
			if(a==1) {
				//tscontroller.displayAdminOptions();
			}
			if(a==2) {
				for(BusinessUnit u:units) {
					System.out.println(u.getUnit_id()+" "+u.getUnit_name());
				}
			}
		
	}

}
