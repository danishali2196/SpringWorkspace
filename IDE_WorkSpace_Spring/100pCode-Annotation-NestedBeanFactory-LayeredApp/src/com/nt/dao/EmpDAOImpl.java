package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmpBO;
@Repository("empDAO")
public class EmpDAOImpl implements EmpDAO {

	private static final String GET_EMP_BY_ID="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	@Autowired
	public DataSource ds;
	
//	public EmpDAOImpl(DataSource ds) {
//		super();
//		this.ds = ds;
//	}


	@Override
	public List<EmpBO> searchEmpByDesg(String desg) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmpBO> listBO=null;
		EmpBO bo=null; 
		
		try {
			//establish the connection
			con=ds.getConnection();
			//create prepared statement object
			ps=con.prepareStatement(GET_EMP_BY_ID);
			//set query param
			ps.setString(1, desg);
			//execute the sql query
			rs=ps.executeQuery();
			//process the resultset(copy resultset obj to listBO)
			listBO=new ArrayList();
			while (rs.next()) {
				bo=new EmpBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				//add bo class obj to list collection
				listBO.add(bo);
			}//while
	
		}//try
		catch (SQLException se) {
			se.printStackTrace();
		}//catch
		catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		finally {
			try {
				if (rs!=null)
					rs.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (ps!=null)
					ps.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con!=null)
					con.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			
		}//finally
		return listBO;
	}//method
}//class
