package com.nt.beans;

import java.util.Random;

public class FlipKart {
	private Courier courier;
	private FlipKart() {
		System.out.println("FlipKart:0-param FlipKart()");
	}
	//setter method  for setter injection
	public void setCourier(Courier courier) {
		System.out.println("FlipKart:setCourier(-)");
		this.courier=courier;
	}
	public String purchese(String items[]) {
		//generating random orderid
		Random rad=new Random();
		int orderid=rad.nextInt(700000);
		//delevery order
		String status=courier.delever(orderid);
		return status+" bill amount for:"+orderid+" is 70000";
		
		
	}
}
