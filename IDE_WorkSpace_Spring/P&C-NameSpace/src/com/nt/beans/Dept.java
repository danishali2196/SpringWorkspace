package com.nt.beans;

import java.util.Date;

import lombok.ToString;

@ToString
public class Dept {
	
	private int dno;
	private String dname;
	private Date date;
	
	
	public Dept(int dno, String dname, Date date) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.date = date;
	}
	
	
	

}
