package com.vishal.spring.form.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vishal.spring.form.bean.Student;

public class StudentValidation implements Validator {

	@Override
	public boolean supports(Class<?> clz) {
		// TODO Auto-generated method stub
		return Student.class.equals(clz);
	}

	@Override
	public void validate(Object object, Errors error) {
		// TODO Auto-generated method stub
		
		Student student = (Student)object;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "name", "valid.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "address", "valid.address");
	
		if(student.getName().length() < 5){
			error.rejectValue("name", "valid.name.min.required");
		}
		
		
	}

	
	
}
