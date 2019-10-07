package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.DeptDAO;

@Service("service")
public class ServiceMgmtDeptImpl implements ServicMgmtDept {
	
	@Autowired
	private DeptDAO dao;
	
//	public ServiceMgmtDeptImpl(DeptDAO dao) {
//		this.dao = dao;
//	}

	public String findDeptCount() {
		System.out.println("ServiceMgmtDeptImpl.findDeptCount()");
		int count=0;
		count=dao.getDeptCount();
		
		return "Total no of dept :::"+count;
	}

	public Map<String, Object> findDeptByNo(int no) {
		Map<String,Object> map=null;
		map=dao.getDeptById(no);
		return map;
	}

	public List<Map<String, Object>> getAllDept() {
		List<Map<String,Object>> list=null;
		list=dao.getAllDept();
		return list;
	}

	public String insertDept(int no, String name, String loc) {
		int count=0;
		count=dao.insertNewDept(no,name,loc); 
		if (count==0) {
			return "Record Not Inserted";
		}
		else {
			return "Record Inserted";
		}
	}

	public String updateDeptLoc(int no, String newLoc) {
		int count=0;
		count=dao.updateDeptLocById(no, newLoc);
		if (count==0) {
			return "Record Not Updated";
		}
		else {
			return "Record Updated";
		}
	}

	public String deleteDeptByNo(int no) {
		int count=0;
		count=dao.deleteDeptById(no);
		if (count==0) {
			return "Record Not Deleted";
		}
		else {
			return "Record Deleted";
		}
	}

}
