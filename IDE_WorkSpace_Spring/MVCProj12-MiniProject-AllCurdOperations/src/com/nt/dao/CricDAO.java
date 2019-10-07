package com.nt.dao;

import java.util.List;

import com.nt.bo.CricketerBO;

public interface CricDAO {
	
	
	public int insertCricketer(CricketerBO bo);
	
	public List<CricketerBO> getCricketer() throws Exception;

	public int editCricketer(CricketerBO bo);
	
	public int deleteCricketer(int no);
	
	public CricketerBO searchCricketerById(int no);
	
}
