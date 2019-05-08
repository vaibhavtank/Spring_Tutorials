package com.vishal.spring.mvc.jdbc.bean.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vishal.spring.mvc.jdbc.bean.Student;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clz) {
		// TODO Auto-generated method stub
		return Student.class.equals(clz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "valid.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "valid.address");
		
	}

}
