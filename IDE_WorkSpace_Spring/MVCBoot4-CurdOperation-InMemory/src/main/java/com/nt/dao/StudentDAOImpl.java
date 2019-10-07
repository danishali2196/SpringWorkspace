package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studDao")
public class StudentDAOImpl implements StudentDAO {
	
	Map<String,Object> map = null;	

	@Override
	public int saveStudent(StudentBO bo) {
		
		map = new HashMap();
		
		map.put("stud", bo);
		System.out.println(map);
		if (map != null) {
			return 1;
		}
		return 0;
	}

	@Override
	public StudentBO getStudent() {
		
		StudentBO bo =null;
		bo = (StudentBO) map.get("stud");
		
		return bo;
	}

}
