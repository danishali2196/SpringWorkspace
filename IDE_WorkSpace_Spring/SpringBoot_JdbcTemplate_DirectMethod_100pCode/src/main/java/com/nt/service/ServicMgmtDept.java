package com.nt.service;

import java.util.List;
import java.util.Map;

public interface ServicMgmtDept {
	
     public String findDeptCount();
     public Map<String,Object> findDeptByNo(int no);
     public List<Map<String,Object>> getAllDept();
     
     public String insertDept(int no,String name,String loc);
     public String updateDeptLoc(int no,String newLoc);
     public String deleteDeptByNo(int no);
	 
}
