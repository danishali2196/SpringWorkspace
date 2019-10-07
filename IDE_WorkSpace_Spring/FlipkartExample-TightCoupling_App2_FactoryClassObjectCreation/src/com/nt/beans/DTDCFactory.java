package com.nt.beans;

public class DTDCFactory {
	
	public static DTDC getInstance() {
		System.out.println("DTDCFactory.getInstance()");
		return new DTDC();
	}

}
