package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeptDAOImpl implements DeptDAO {
	private static final String GET_NO_OF_DEPT="SELECT COUNT(*) FROM DEPT";	
	private static final String GET_DEPT_BY_NO="SELECT DEPTNO,DNAME,LOC FROM DEPT WHERE DEPTNO=?";
	private static final String GET_ALL_DEPT="SELECT DEPTNO,DNAME,LOC FROM DEPT";
	
	private static final String INSERT_DEPT="INSERT INTO DEPT(DEPTNO,DNAME,LOC) VALUES(?,?,?) ";
	private static final String UPDATE_DEPTLOC_BY_ID="UPDATE DEPT SET LOC=? WHERE DEPTNO=?";
	private static final String DELETE_DEPT_BY_ID="DELETE DEPT WHERE DEPTNO=?";
	
	private JdbcTemplate jt;
	
	public DeptDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
		System.out.println("Data source::"+jt.getDataSource().getClass().getName());
	}

	public int getDeptCount() {
		int count=0;
		count=jt.queryForObject(GET_NO_OF_DEPT, Integer.class);
	
		return count;
	}

	public Map<String,Object> getDeptById(int no) {
		Map<String,Object> map=null;
		map=jt.queryForMap(GET_DEPT_BY_NO, no);
		return map;
	}

	public List<Map<String, Object>> getAllDept() {
		List<Map<String,Object>> list=null;
		list=jt.queryForList(GET_ALL_DEPT);
		return list;
	}

	public int insertNewDept(int no, String name, String loc) {
		int  count=0;
		count=jt.update(INSERT_DEPT, no,name,loc);
		return count;
	}

	public int updateDeptLocById(int no,String newLoc) {
		int count=0;
		count=jt.update(UPDATE_DEPTLOC_BY_ID,newLoc, no);
		return count;
	}

	public int deleteDeptById(int no) {
		int count = 0;
		count=jt.update(DELETE_DEPT_BY_ID, no);
		return count;
	}

	
	
	


}
