package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
public class UserDTO implements Serializable{
	private String name;
	private Date dob;
	private String gender;
	private String addrs;
	private long mobile;

}
