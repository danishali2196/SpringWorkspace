package com.nt.service;

public class BankService {
	
	public float simpleInstCalculation(float pric,float rate,float time) {
		float retVal=0;
		retVal=pric*rate*time/100.0f;
		
		return retVal;
		
	}

}
