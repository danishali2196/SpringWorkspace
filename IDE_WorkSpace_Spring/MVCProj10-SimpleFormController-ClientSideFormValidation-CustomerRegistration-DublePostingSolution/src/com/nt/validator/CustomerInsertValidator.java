package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.CustomerCommand;
import com.sun.org.apache.xpath.internal.functions.Function;

public class CustomerInsertValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerInsertValidator.supports()");
		return clazz.isAssignableFrom(CustomerCommand.class);
	}

	@Override
	public void validate(Object obj, Errors err) {
		String vStatus=null;
		//type casting
		CustomerCommand cmd=(CustomerCommand) obj;
		vStatus=cmd.getVflag();
		if (vStatus.equalsIgnoreCase("no")) {
	
			
		//ServerSide form validation
		if (cmd.getCname() == null || cmd.getCname().equals("")) {
			err.rejectValue("cname", "cname.required");
		}
		
		if (cmd.getCaddrs() == null || cmd.getCaddrs().equals("")) {
			err.rejectValue("caddrs", "caddrs.required");
		}
		else if (cmd.getCaddrs().length() < 3 || cmd.getCaddrs().length()  >  10) {
			err.rejectValue("caddrs", "caddrs.range");
		}
		
		if (String.valueOf(cmd.getMobileNo()).length() != 10) {
			err.rejectValue("mobileNo","mobileNo.length");
		}
		
		if (cmd.getBillAmt() == null ) {
			err.rejectValue("billAmt", "billAmt.required");
		}

	}
	}

}
