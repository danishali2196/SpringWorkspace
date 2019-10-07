package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	
	public EmployeeDTO getEmployeeById(int eid);
	
	public List<EmployeeDTO> getEmployeeByDesg(String desg);
	
	public String inserEmployee(EmployeeDTO dto);

}
