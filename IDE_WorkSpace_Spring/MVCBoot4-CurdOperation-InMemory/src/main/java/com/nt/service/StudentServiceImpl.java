package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("studService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO dao;
	
	@Override
	public String insertData(StudentDTO dto) {

		String result = null;
		StudentBO bo = null;
		
		bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		
		result = dao.saveStudent(bo)==1?"record inserted":"record not inserted";

		return result;
	}

	@Override
	public StudentDTO retriveStud() {
		
		StudentDTO dto = new StudentDTO();
		StudentBO bo = new StudentBO();
		
		bo = dao.getStudent();
		
		BeanUtils.copyProperties(bo, dto);
		System.out.println("dto::"+dto);
		return dto;
	}
	
	

}
