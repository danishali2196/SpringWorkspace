package com.nt.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.bo.EmpBO;

public class EmpDAOImpl implements EmpDAO {
	private static final String GET_EMP_BY_ID="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public EmpBO findEmpById(int no)throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		EmpBO bo=null;
		
		con=ds.getConnection();
		if (con!=null) {
			ps=con.prepareStatement(GET_EMP_BY_ID);
		}
		if (ps!=null) {
			ps.setInt(no, 1);
		}
		if(rs.next()) {
			bo=new EmpBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getInt(4));
		}
				
		
		
		return bo;
	}

}
