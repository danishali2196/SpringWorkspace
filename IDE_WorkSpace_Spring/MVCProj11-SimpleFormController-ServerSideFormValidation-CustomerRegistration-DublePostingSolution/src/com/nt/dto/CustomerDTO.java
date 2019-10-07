package com.nt.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO implements Serializable {
	
	private String cname;
	private String caddrs;
	private long mobileNo;
	private float billAmt;

	

}
