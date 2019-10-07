package com.nt.command;

import java.util.Date;

import lombok.Data;

@Data
public class UserCommand {
	
	private String name="danish";
	private Date dob;
	private String gender="male";
	private String addrs="hyd";
	private long mobile=9589619147l;

}
