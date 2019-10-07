package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.bo.StudentBO;

@Component("sDAO")
public class StudentDAOImpl implements StudentDAO {
	private final static String INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
	
	@Autowired
	public DataSource ds;

	@Override
	public int insertBO(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		System.out.println(ds);
		con=ds.getConnection();
		if(con!=null) {
			ps=con.prepareStatement(INSERT_QUERY);
		}
		
		if (ps!=null) {
			ps.setInt(1,bo.getSno());
			ps.setString(2,bo.getSname());
			ps.setInt(3,bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5,bo.getResult());
			ps.setString(6,bo.getSadd());
			
		}
		
		count=ps.executeUpdate();
	
		
		ps.close();
		con.close();

		return count;
	}

}
