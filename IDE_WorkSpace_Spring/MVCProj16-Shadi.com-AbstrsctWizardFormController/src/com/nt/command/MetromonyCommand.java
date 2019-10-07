package com.nt.command;

import java.util.Date;

import lombok.Data;

@Data
public class MetromonyCommand {
	
	private String name;
	private String addrs;
	private Date dob;
	private String gender;
	
	private String qlfy;
	private String desg;
	private float salary;
	
	private byte expAge;
	private String[] expHobies;


}
