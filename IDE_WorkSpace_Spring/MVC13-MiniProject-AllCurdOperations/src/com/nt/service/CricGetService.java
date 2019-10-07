package com.nt.service;

import java.util.List;

import com.nt.dto.CricketerDTO;


public interface CricGetService {
	public List<CricketerDTO> fetchAllCricketer() throws Exception;
}

