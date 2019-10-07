package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Component("sService")
public class StudentServiceIMPL implements StudentService {
	
	@Autowired
	public StudentDAO dao;

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		int total =0;
		float avg=0.0f;
		String result = null;
		int count=0;
		
		StudentBO bo=new StudentBO();
		
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(dto.getM1()<33 || dto.getM2()<33 || dto.getM3()<33) {
			result =" Fail";
		}else {
			result = "Pass";
		}
			
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		count=dao.insertBO(bo);
		
		if (count == 0) {
			return "Student Registration Failed:: Result is->"+result;
			
		}else {
			return "Student Registration Sccesfully:: Result is->"+result;
		}
			

	}

}
