package com.nt.beans;

public class FlipKart {
	
	private Courier courier;
	
	public FlipKart() {
		System.out.println("FlipKart.FlipKart()");

	}
	public void setCourier(Courier courier) {
		System.out.println("FlipKart.setCourier()");
		this.courier=courier;
	}
	
	public void purchase() {
		
		System.out.println("FlipKart.purchase()");
		
	}
	

}
