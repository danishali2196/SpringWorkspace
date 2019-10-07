package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CricketerBO;
import com.nt.dao.CricDAO;
import com.nt.dto.CricketerDTO;

public class CricServiceImpl implements CricService {

	private CricDAO dao;
	
	public CricServiceImpl(CricDAO dao) {
		System.out.println("CricServiceImpl.CricServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String saveCricketer(CricketerDTO dto) {
		CricketerBO bo=null;
		String msg=null;
		
		//convert dto to bo
		bo=new CricketerBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		return msg=dao.insertCricketer(bo)==1?"record inserted":"record insertion failed";
		
	}

	@Override
	public List<CricketerDTO> fetchAllCricketer() throws Exception {
		List<CricketerBO> listBO=null;
		List<CricketerDTO> listDTO=null;
		CricketerDTO dto=null;
		
		listBO=dao.getCricketer();
		listDTO=new ArrayList();
		for (CricketerBO bo : listBO) {
			dto=new CricketerDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}
		return listDTO;
	}
	
	@Override
	public CricketerDTO fecthCricketerById(int no) {
		CricketerDTO dto=null;
		CricketerBO bo=null;
		
		bo=dao.searchCricketerById(no);
		dto=new CricketerDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
	
	@Override
	public String editCricketer(CricketerDTO dto) {
		String msg =null;
		CricketerBO bo =null;
		BeanUtils.copyProperties(dto, bo);
	
		msg=dao.editCricketer(bo)==1?"Record Updated":"Record Not Updated";
		return msg;
	}
	
	
	@Override
	public String removeCricketer(int no) {
		String msg =null;
		
	
		msg=dao.deleteCricketer(no)==1?"Record Deleted":"Record Not Deleted";
		return msg;
	}

}
