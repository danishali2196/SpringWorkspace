package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DeptDAO {
	
	public int getDeptCount();
	public Map<String,Object> getDeptById(int no);
	public List<Map<String,Object>> getAllDept();
	
	public int insertNewDept(int no,String name,String loc);
	public int updateDeptLocById(int no,String newLoc);
	public int deleteDeptById(int no);
}
