package com.vishal.spring.session.managment.bean.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vishal.spring.session.managment.bean.Login;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clz) {
		// TODO Auto-generated method stub
		return Login.class.equals(clz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name", "Enter Name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password", "Enter Password");
		
	}

	
}
