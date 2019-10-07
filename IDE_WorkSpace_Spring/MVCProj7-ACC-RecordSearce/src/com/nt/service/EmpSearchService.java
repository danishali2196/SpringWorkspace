package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;

public interface EmpSearchService {
	
	public List<EmployeeResultDTO> fetchEmployee(EmployeeDTO dto); 

}
