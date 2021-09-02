package main;

import java.util.Scanner;

import model.Trade;

public class TradeThread implements Runnable{
String trade_name;
Scanner sc=new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Enter a trade:");
		trade_name=sc.next();
		Trade trade=new Trade(trade_name);
		
		System.out.println(trade.getTrade_name()+" is added succesfully.");
		
	}

}
