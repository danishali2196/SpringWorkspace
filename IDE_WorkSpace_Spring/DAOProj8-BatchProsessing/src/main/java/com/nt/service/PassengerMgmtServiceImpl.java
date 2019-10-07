package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PassengerBO;
import com.nt.dao.PassengerDAO;
import com.nt.dto.PassengerDTO;

@Service("pService")
public class PassengerMgmtServiceImpl implements PassengerMgmtService {

	@Autowired
	private PassengerDAO dao;
	
	public String insertPassenger(List<PassengerDTO> listDTO) {
		List<PassengerBO> listBO=new ArrayList();
		for(PassengerDTO dto:listDTO) {
			PassengerBO bo=null;
			bo=new PassengerBO();
			bo.setName(dto.getName());
			bo.setSource(dto.getSource());
			bo.setDest(dto.getDest());
			bo.setPrice(dto.getPrice());
			listBO.add(bo);
		}
		
		int result[]=dao.groupReservation(listBO);
		if (result!=null) {
			return "Passenger Reservation Succeed";
		}
		else {
			return "reservation failed";
		}
		

	}

}
