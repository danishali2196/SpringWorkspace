package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpDTO implements Serializable {
	
	private int eno;
	private String ename;
	private String desg;
	private int salary;


}
