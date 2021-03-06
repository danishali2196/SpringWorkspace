package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CricketerBO;
import com.nt.dao.CricGetDao;
import com.nt.dto.CricketerDTO;

public class CricGetServiceImpl implements CricGetService {
	CricGetDao dao;
	
	public CricGetServiceImpl(CricGetDao dao) {
		this.dao = dao;
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

}
