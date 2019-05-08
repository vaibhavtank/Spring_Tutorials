package com.vishal.spring.file.bean.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vishal.spring.file.bean.Form;

public class FormValidator implements Validator{

	@Override
	public boolean supports(Class<?> clz) {
		// TODO Auto-generated method stub
		return Form.class.equals(clz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		
		Form form = (Form)object;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "valid.name");
		
		if(form.getFile().getSize() == 0){
			errors.rejectValue("file", "valid.file");
		}
		
	}

	
	
}
