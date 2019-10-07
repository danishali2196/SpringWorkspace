package com.nt.dao;

import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.empBO;

//SQL> SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN('CLERK','MANAGER')ORDER BY JOB;
public class empDAOimpl implements empDAO {
	//private static final String SELECT_EMP_BY_DESG="SELECT ENO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?) ORDER BY JOB";

	private DataSource ds;
	
	public empDAOimpl(DataSource ds) {
		this.ds = ds;
	}

	public List<empBO> findEmpDetailByDesg(String desg1,String desg2,String desg3){
	return listBO;
	}

	@Override
	public int insert(empBO bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
