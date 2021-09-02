package service.impl;

import service.TradeService;

public class TradeServiceImpl implements TradeService {
private Thread t2;

	public TradeServiceImpl(Thread t2) {
	
	this.t2 = t2;
}

	@Override
	public void addTrade() {
		t2.start();
		
	}

	@Override
	public void deleteTrade() {
		// TODO Auto-generated method stub
		
	}

}
