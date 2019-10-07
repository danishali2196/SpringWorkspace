package com.nt.service;

import java.util.ArrayList;
import java.util.LinkedList;
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
	public List<CricketerDTO> fatchAllCricketer() {
		List<CricketerBO> listBO=null;
		List<CricketerDTO> listDTO=new ArrayList();
		
		listBO=dao.getAllCricketers();
		
		listBO.forEach(bo->{
			CricketerDTO dto=new CricketerDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		
		
		return listDTO;
	}



}
