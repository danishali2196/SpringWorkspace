package com.nt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.CricketerCommand;
import com.nt.dto.CricketerDTO;
import com.nt.service.CricService;

public class EdirCricketerController extends SimpleFormController {
	private CricService service;
	
	public EdirCricketerController(CricService service) {
		this.service = service;
	}
	
	
	@Override
	public ModelAndView onSubmit(Object command,	BindException errors) throws Exception {
		System.out.println("EdirCricketerController.onSubmit()");
		CricketerCommand cmd=(CricketerCommand) command;
		CricketerDTO dto = new CricketerDTO();
		
		dto.setId(cmd.getId());
		dto.setName(cmd.getName());
		dto.setAge(cmd.getAge());
		dto.setRunsodi(cmd.getRunsodi());
		dto.setRunstest(cmd.getRunstest());
		dto.setRunst20(cmd.getRunst20());

		String msg=service.editCricketer(dto);
		
		return new ModelAndView("result","msg",msg);
	}

	@Override
	protected Object formBackingObject(HttpServletRequest req) throws Exception {
		CricketerDTO dto=null;
		System.out.println("EdirCricketerController.formBackingObject()");
		int id=Integer.parseInt(req.getParameter("id"));
		dto = service.fecthCricketerById(id);
		
		CricketerCommand cmd=new CricketerCommand();
		cmd.setId(dto.getId());
		cmd.setName(dto.getName());
		cmd.setAge(dto.getAge());
		cmd.setRunsodi(dto.getRunsodi());
		cmd.setRunstest(dto.getRunstest());
		cmd.setRunst20(dto.getRunst20());
		
		return cmd;
	}
	
	
	

}
