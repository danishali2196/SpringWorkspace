package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("eng")
public class Engine {
	
	@Value("101")
	private int engno;
	@Value("Petrol")
	private String engtype;
	

	
	public void setEngno(int engno) {
		this.engno = engno;
	}
	public void setEngtype(String engtype) {
		this.engtype = engtype;
	}
	@Override
	public String toString() {
		return "Engine [engno=" + engno + ", engtype=" + engtype + "]";
	}
	
	

}
