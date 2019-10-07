package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.CustomerCommand;
import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;

public class CustomerInsertController extends SimpleFormController {
	private CustomerService service;
	
	public CustomerInsertController(CustomerService service) {
		this.service = service;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		CustomerCommand cmd=(CustomerCommand)command;
		String msg=null;
		//convert to dto
		CustomerDTO dto=new CustomerDTO();
		BeanUtils.copyProperties(cmd, dto);
		
		//use service
		msg=service.register(dto);
		return new ModelAndView(this.getSuccessView(), "msg", msg);
	}
	
	 @Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		 return new ModelAndView("dbpost");
	}
	 
//	 @Override
//	public Object formBackingObject(HttpServletRequest req) throws Exception {
//		
//		 CustomerCommand cmd=new CustomerCommand();
//		 cmd.setCname(cname);
//		 
//	}

}
