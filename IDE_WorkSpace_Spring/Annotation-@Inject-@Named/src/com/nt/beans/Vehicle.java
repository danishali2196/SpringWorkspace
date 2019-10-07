package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("veh")
public class Vehicle {
	@Value("202")
	private int vno;
	@Value("Bus")
	private String vtype;
	
	//@Inject
	private Engine eng;
	
	@Inject
	public Vehicle(Engine eng) {
		this.eng = eng;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
//	@Inject
//	public void setEng(Engine eng) {
//		this.eng = eng;
//	}

	@Override
	public String toString() {
		return "Vehicle [vno=" + vno + ", vtype=" + vtype + ", eng=" + eng + "]";
	}
	
	

}
