package com.nt.beans;

public class MyWebContainer {
	
	private ResquestHandler handler;
	int count;
	public MyWebContainer() {
		count++;
		System.out.println("MyWebContainer::0-param constructor"+count);
	}
	
	public void setHandler(ResquestHandler handler) {
		this.handler = handler;
	}
	
	public void processRequest(String data) {
		handler.hander(data);
	}
	
	

}
