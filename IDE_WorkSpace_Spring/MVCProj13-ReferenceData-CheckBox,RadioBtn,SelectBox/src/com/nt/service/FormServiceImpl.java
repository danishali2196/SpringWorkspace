package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.FormBO;
import com.nt.dao.FormDAO;
import com.nt.dto.FormDTO;

public class FormServiceImpl implements FormService {
	private FormDAO dao;
	
	public FormServiceImpl(FormDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<FormDTO> getAllCountries() {
		List<FormDTO> listDto=new ArrayList();
		List<FormBO> listBO=null;
		
		listBO=dao.getCountry();
		
		for (FormBO bo : listBO) {
			FormDTO dto=new FormDTO();
			dto.setCountry(bo.getCountry());
	//	System.out.println("FormServiceImpl.getAllCountries()"+dto);
			listDto.add(dto);
		}
	//	System.out.println("service listdto"+listDto);
		return listDto;

	}

	@Override
	public List<FormDTO> getAllGenders() {
		List<FormDTO> listDTO=new ArrayList();
		List<FormBO> listBO=null;
		
		listBO=dao.getGender();
		System.out.println("listBO"+listBO);
		for (FormBO formBO : listBO) {
			FormDTO dto=new FormDTO();
			dto.setGender(formBO.getGender());
	//		System.out.println("FormServiceImpl.getAllGenders()"+dto);
			listDTO.add(dto);
		}
	//	System.out.println("listDTO======"+listDTO);
		return listDTO;
	}

}
