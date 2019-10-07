package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	//bean property
	private String name;
	private Date date;
	
	//getter method for setter injection
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	
	//business logic
	public String generatorWissMsg() {
		return "Good Morning" +name+ " "+date;
	}

}
