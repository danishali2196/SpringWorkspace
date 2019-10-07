package com.nt.beans;

public class Bank {
	
	public float calcIntsAmount(float pamt,float time) {
		System.out.println("Bank.calcIntsAmount(-,-)");
		
		return pamt*time*2.0f/100;
	}

}
