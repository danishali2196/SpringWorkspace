package com.nt.beans;

import java.util.Date;

public class VotingElgibility {
	
	private String name;
	private String addrs;
	private int age;
	public Date validateOf;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//custom init method
	public void myInit() {
		System.out.println("VotingElgibility.myInit()");
		if (name==null || age<=0) {
			throw new IllegalArgumentException("name and age value is invalid");
		}
	}	
	//bussines logic
		public String checkElgibility() {
			if (age>=18) {
				return "mr/miss "+name+" you are eligible for voting"; 
			}
			else
				return "mr/miss "+name+" you are not eligible for voting";
		}
		
	//custom distroy method
		public void myDistroy(){
			System.out.println("VotingElgibility.myDistroy()");
			name=null;
			age=0;
			addrs=null;
		}
	

}
