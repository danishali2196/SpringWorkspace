package com.nt.command;

import java.util.Date;

import lombok.Data;


public class RegistrationCommand {
	
	private String name;
	private String addrs;
	private Date dob;
	private Date doj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "RegistrationCommand [name=" + name + ", addrs=" + addrs + ", dob=" + dob + ", doj=" + doj + "]";
	}
	
	
}
