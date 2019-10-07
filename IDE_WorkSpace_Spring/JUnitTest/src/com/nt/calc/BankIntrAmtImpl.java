package com.nt.calc;

public class BankIntrAmtImpl implements BankIntrAmt {

	@Override
	public float simpleInterest(float amt, float rate, float time) throws Exception {
		
		if (amt <= 0.0f  || rate <=0.0f || time <= 0.0f) {
			throw new IllegalArgumentException("invalid Arguments");
		}
		else {
		return (amt*rate*time)/100.0f;
		}
		
	}

}
