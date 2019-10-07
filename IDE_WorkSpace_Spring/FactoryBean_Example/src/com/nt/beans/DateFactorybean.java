package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactorybean implements FactoryBean<Date> {
	
	private int year;
	private int month;
	private int day;
	
	

	public DateFactorybean(int year, int month, int day) {
		System.out.println("DateFactorybean.DateFactorybean(-,-,-)");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Date getObject() throws Exception {
	
		System.out.println("DateFactorybean.getObject()");
		return new Date(year,month,day);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactorybean.getObjectType()");
		return Date.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("DateFactorybean.isSingleton()");
		return true;
	}
	


}
