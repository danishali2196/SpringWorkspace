package com.nt.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeVO implements Serializable {

	private int empNo;
	private String ename;
	private String job;
	private float sal;
}
