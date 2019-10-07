package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class PassengerBO implements Serializable {
	
	private String name;
	private String source;
	private String dest;
	private int price;
	

}
