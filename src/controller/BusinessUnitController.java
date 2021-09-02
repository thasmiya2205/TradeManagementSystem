package controller;

import service.impl.BusinessUnitServiceImpl;


public class BusinessUnitController {
	private Thread t;
	private BusinessUnitServiceImpl bunitservice;
	public BusinessUnitController(Thread t, BusinessUnitServiceImpl bunitservice) {
		this.t=t;
		this.bunitservice=bunitservice;
	}

	public void addNewBusinessUnit() {
		//call AddBusinessUnit() from BusinessUnitService
		bunitservice.addBusinessUnit();


	}

	public void deleteBusinessUnit() {
		//call deleteBusinessUnit() from BusinessUnitService
		
	}

}
