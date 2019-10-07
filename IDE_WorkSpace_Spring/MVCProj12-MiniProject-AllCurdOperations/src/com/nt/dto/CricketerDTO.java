package com.nt.dto;

import java.io.Serializable;

public class CricketerDTO implements Serializable{
	
	private int id;
	private String name;
	private int age;
	private int runsodi;
	private int runstest;
	private int runst20;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRunsodi() {
		return runsodi;
	}
	public void setRunsodi(int runsodi) {
		this.runsodi = runsodi;
	}
	public int getRunstest() {
		return runstest;
	}
	public void setRunstest(int runstest) {
		this.runstest = runstest;
	}
	public int getRunst20() {
		return runst20;
	}
	public void setRunst20(int runst20) {
		this.runst20 = runst20;
	}
	
	
	
}
