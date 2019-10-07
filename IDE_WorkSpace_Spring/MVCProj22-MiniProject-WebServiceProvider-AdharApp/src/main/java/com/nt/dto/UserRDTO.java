package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="User-Detail")
public class UserRDTO implements Serializable{
	
	private String name;
	private Date dob;
	private String gender;
	private String addrs;
	private long mobile;

}
