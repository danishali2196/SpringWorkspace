package com.nt.beans;

public class FlipKart {
	
	public FlipKart() {
		System.out.println("FlipKart.FlipKart()");

	}
	
	public void purchase() {
		
		DTDC dtdc=DTDCFactory.getInstance();
		dtdc.deliver();
		
	}
	

}
