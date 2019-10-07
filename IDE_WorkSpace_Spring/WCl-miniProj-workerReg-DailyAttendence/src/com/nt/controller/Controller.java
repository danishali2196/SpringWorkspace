package com.nt.controller;

import com.nt.dto.Dto;
import com.nt.vo.Vo;

public class Controller {

	public String processWorker(Vo vo)throws Exception{
	Dto dto=null;	
	String result=null;
	
	dto=new Dto();
	dto.setWorkerNo(Integer.parseInt(vo.getWorkerNo()));
	dto.setWorkerName(vo.getWorkerName());
	dto.setAge(Integer.parseInt(vo.getAge()));
	dto.setDesignation(vo.getDesignation());
	dto.setWorkerNominee(vo.getWorkerNominee());
	dto.setDoj(Integer.parseInt(vo.getDoj()));
	dto.setDor(Integer.parseInt(vo.getDor()));
	
	result=service.generateResult(dto);
	return result;
	
	
	}
}
