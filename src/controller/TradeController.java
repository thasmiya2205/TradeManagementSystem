package controller;

import service.impl.TradeServiceImpl;

public class TradeController {
	private TradeServiceImpl tradeserviceimpl;
	
	
	
	public TradeController(TradeServiceImpl tradeserviceimpl) {
		this.tradeserviceimpl=tradeserviceimpl;
	}

	public void addTrade(){
		
		//call deleteBusinessUnit() from BusinessUnitService
		tradeserviceimpl.addTrade();
		
		//press 1 to return to home
			//press 2 to view list
	}

	public void deleteTrade() {
		//call deleteUser() from UserService
		System.out.println("deleted");
		
		//press 1 to return to home
			//press 2 to view list
	}

	
}
