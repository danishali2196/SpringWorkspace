package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PassengerBO;

@Repository("pDAO")
public class PassengerDAOImpl implements PassengerDAO {
	private static final String INSERT_QUERY="INSERT INTO RAILWAY_TICKET VALUES(PAS_SEQ.NEXTVAL,?,?,?,?)";

	@Autowired
	private JdbcTemplate jt;
	
	public int[]  groupReservation(List<PassengerBO> listBO) {
		int count[]=null;
		
		count= jt.batchUpdate(INSERT_QUERY, new PassengerBatch(listBO));
		
		return count;
	}
	
	private final class PassengerBatch implements BatchPreparedStatementSetter{
			private List<PassengerBO> listBO;
			public PassengerBatch(List<PassengerBO> listBO) {
				this.listBO = listBO;
			}
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1,listBO.get(i).getName());
				ps.setString(2,listBO.get(i).getSource());
				ps.setString(3,listBO.get(i).getDest());
				ps.setInt(4, listBO.get(i).getPrice());
				
			}
			public int getBatchSize() {
				return listBO.size();
			}
	}
}
