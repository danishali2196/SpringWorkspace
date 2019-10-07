package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Named;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Named("veh")
@Scope("prototype")				//by default scope is singleton
public class Vehicle {
	@Value("202")
	private int vno;
	@Value("Bus")
	private String vtype;

	//@Resource
	private Engine eng;
	
	/*	this @Resouce not work with constructor		*/
//	@Resource
//	public Vehicle(Engine eng) {
//		this.eng = eng;
//	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	@Resource
	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Vehicle [vno=" + vno + ", vtype=" + vtype + ", eng=" + eng + "]";
	}
	
	

}
