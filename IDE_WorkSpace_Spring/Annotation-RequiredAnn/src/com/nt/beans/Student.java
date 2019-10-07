package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private float fee;
	private Book bk;
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	@Required
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Required
	public void setCourse(String course) {
		this.course = course;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	@Required
	public void setBk(Book bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + ", bk=" + bk + "]";
	}
	
	
	

}
