package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegistrationCommand;

public class StudentValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RegistrationCommand.class);
	}

	@Override
	public void validate(Object obj, Errors err) {
		
		RegistrationCommand cmd=(RegistrationCommand) obj;
		
		if (cmd.getName() == null || cmd.getName().length() <= 0 || cmd.getName() == "") {
			err.rejectValue("name","name.required" );
		}
		
		if (cmd.getAddrs() == null || cmd.getAddrs().length() <= 0 || cmd.getAddrs() == "") {
			err.rejectValue("addrs","addrs.required" );
		}
		
	}

}
