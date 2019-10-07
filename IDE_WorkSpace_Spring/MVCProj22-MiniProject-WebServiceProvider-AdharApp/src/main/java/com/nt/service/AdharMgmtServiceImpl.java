package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBO;
import com.nt.bo.UserRBO;
import com.nt.dao.AdharDAO;
import com.nt.dto.UserDTO;
import com.nt.dto.UserRDTO;

@Service("adharService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=false,transactionManager="hbTxMgmr")
@WebService(endpointInterface="com.nt.service.AdharMgmtService")
public class AdharMgmtServiceImpl implements AdharMgmtService {
	
	@Autowired
	private AdharDAO dao;
	
	public AdharMgmtServiceImpl(){
		System.out.println("AdharMgmtServiceImpl:0-param constructor");
	}

	@Override
	public String insertRecord(UserDTO dto) {
		System.out.println("AdharMgmtServiceImpl.insertRecord()");
		UserBO bo= null;
		String msg = null;
		
		bo = new UserBO();
		BeanUtils.copyProperties(dto, bo);
		
		msg = dao.storeRecord(bo) == 0?"Record Not Inserted":"Record Inserted Successfully";
		
		return msg;
	}

	@Override
	public List<UserRDTO> fetchRecord(long id) {
		System.out.println("AdharMgmtServiceImpl.fetchRecord()");
		System.out.println("id::"+id);
		List<UserRDTO> listRdto = new ArrayList();
		UserRDTO dto = null;
		List<UserRBO> listRbo =null;
		
		
		listRbo = dao.getRecordById(id);
		
		System.out.println("service:"+listRbo);
		
		for (UserRBO bo : listRbo) {
			dto = new UserRDTO();
			BeanUtils.copyProperties(bo, dto);
			listRdto.add(dto);
		}
		
		
		System.out.println("service:"+dto);
		return listRdto;
	}

}
