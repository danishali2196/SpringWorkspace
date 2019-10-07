package com.nt.service;

import java.util.List;

import com.nt.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> findEmpByDesg(String desg)throws Exception;
}
