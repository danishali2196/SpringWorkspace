package com.nt.dao;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	
	public  int  saveStudent(StudentBO bo);
	
	public StudentBO getStudent();

}
