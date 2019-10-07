package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeBO implements Serializable {
	
	private int eno;
	private String ename;
	private String desg;
	private int salary;
	

}
