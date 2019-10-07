package com.nt.beans;

public abstract class  MyWebContainer {
	
	private ResquestHandler handler;
	int count;
	public MyWebContainer() {
		count++;
		System.out.println("MyWebContainer::0-param constructor"+count);
	}
	
	
	public void processRequest(String data) {
		ResquestHandler handler=getResquestHandler();
		handler.hander(data);
	}
	
	public abstract ResquestHandler getResquestHandler(); 
	
	

}
