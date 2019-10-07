package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeBO implements Serializable {
	
	private int empNo;
	private String ename;
	private String job;
	private float sal;
	private int deptNo;

}
