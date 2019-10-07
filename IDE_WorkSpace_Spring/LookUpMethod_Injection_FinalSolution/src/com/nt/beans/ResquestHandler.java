package com.nt.beans;

public class ResquestHandler {
	

	private static int count;

	public ResquestHandler() {
		count++;
		System.out.println("ResquestHandler::0-Param Constructor"+count);
	}
	
	public void hander(String data) {
		
		System.out.println("handling Request "+count+" Data "+data);
	}
	
	

}
