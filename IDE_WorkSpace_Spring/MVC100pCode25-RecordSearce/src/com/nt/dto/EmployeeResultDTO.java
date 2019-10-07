package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeResultDTO implements Serializable {

	private int empNo;
	private String ename;
	private String job;
	private float sal;
}
