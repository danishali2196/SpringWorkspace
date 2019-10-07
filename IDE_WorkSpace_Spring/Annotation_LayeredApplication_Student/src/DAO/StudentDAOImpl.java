package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import BO.StudentBO;

@Repository
public final class StudentDAOImpl implements StudentDAO{
	private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	
//	public StudentDAOImpl(DataSource ds) {
//		this.ds = ds;
//	}


	public int insert(StudentBO bo)throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//get pooled jdbc con obj from connection pool
		con=ds.getConnection();
		//create jdbc prepared object
		if (con!=null) {
			ps=con.prepareStatement(INSERT_STUDENT_QUERY);
			
		}
		if (ps!=null) {
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getSname());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5, bo.getResult());
			ps.setString(6, bo.getSadd());
			
			
		}
		//execute the query
		count=ps.executeUpdate();
		//close jdbc obj
		ps.close();
		con.close();
		return count;
	}
	
	

}
