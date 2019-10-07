package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoterApp {
	@Value("Danish")
	private  String vname;
	@Value("17")
	private int age;
	@Value("chhindwara")
	private String addrs;
	
	@PostConstruct
	public void myInit() {
		System.out.println("VoterApp.myInit()");
		if (vname==null || age<=0) {
			throw new IllegalArgumentException("name age must be set");
			
		}
	}
	
	@PreDestroy
	public  void myDestroy() {
		System.out.println("VoterApp.myDestroy()");
		vname=null;
		age=0;
		addrs=null;
	}
	
	public String checkVoterEligibility() {
		if (age<18) {
			return vname+"::You Are Not Eligible";
		}
		else {
			return vname+"::You Are Eligible";
			
		}
	}
	
	
	
	

}
