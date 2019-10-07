package com.nt.service;

import java.util.List;

import com.nt.dao.empDAO;
import com.nt.dto.empDTO;

public class EmpServiceImpl {
	private empDAO dao;
	public EmpServiceImpl(empDAO dao) {
		this.dao=dao;
	}
	public List<empDTO> searchEmpByDesg(String desg1,String desg2;String desg3){
		List<empBO> listBO=dao.findEmpDetailByDesg(String desg1,String desg2,String desg3);
		listBO=
	}
}
