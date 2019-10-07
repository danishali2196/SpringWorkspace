package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.CustomerCommand;

public class CustomerInsertValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerInsertValidator.supports()");
		return clazz.isAssignableFrom(CustomerCommand.class);
	}

	@Override
	public void validate(Object obj, Errors err) {
		//type casting
		CustomerCommand cmd=(CustomerCommand) obj;
		
		//form validation
		if (cmd.getCname() == null || cmd.getCname().equals("")) {
			err.rejectValue("cname", "cname.required");
		}
		
		if (cmd.getCaddrs() == null || cmd.getCaddrs().equals("")) {
			err.rejectValue("caddrs", "caddrs.required");
		}
		else if (cmd.getCaddrs().length() < 3 || cmd.getCaddrs().length()  >  10) {
			err.rejectValue("caddrs", "caddrs.range");
		}
		if (cmd.getMobileNo()==null ) {
			err.rejectValue("mobileNo","typeMismatcher.mobileNo");
		}
		else if (String.valueOf(cmd.getMobileNo()).length() != 10) {
			err.rejectValue("mobileNo","mobileNo.length");
		}
		
		if (cmd.getBillAmt() == null ) {
			err.rejectValue("billAmt", "billAmt.required");
		}

	}

}
