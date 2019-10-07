package com.nt.beans;

public class IntrAmtCalculator {
	
	public IntrAmtDetails details;
	
	public void setDetails(IntrAmtDetails details) {
		this.details =details;
	}
	
	public float calcIntrAmt() {
		return (details.getPrinciple()*details.getRate()*details.getTime())/100.0f;
	}

}
