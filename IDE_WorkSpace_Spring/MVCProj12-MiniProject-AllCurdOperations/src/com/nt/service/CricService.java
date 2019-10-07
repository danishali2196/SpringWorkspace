package com.nt.service;

import java.util.List;

import com.nt.dto.CricketerDTO;

public interface CricService {
	
		public String saveCricketer(CricketerDTO dto);
		
		public List<CricketerDTO> fetchAllCricketer() throws Exception;
		
		public CricketerDTO fecthCricketerById(int no);
		
		public String editCricketer(CricketerDTO dto);
		
		public String removeCricketer(int no);

}
