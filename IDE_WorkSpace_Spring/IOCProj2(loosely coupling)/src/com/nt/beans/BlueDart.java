package com.nt.beans;

public class BlueDart implements Courier {

	public BlueDart() {
		
		System.out.println("BlueDart::0 param BlueDart()");
		}
	public final String delever(int orderid) {
		return "BlueDart is ready to delever the product ::"+orderid;
	}
	
}
