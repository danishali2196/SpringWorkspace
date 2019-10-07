package com.nt.command;

import java.util.List;

import lombok.Data;

@Data
public class FormCommand {
	
	private String name;
	private String addrs;
	private String country;
	private String gender;
	private List<String> hobies;
	private List<String> product;

}
