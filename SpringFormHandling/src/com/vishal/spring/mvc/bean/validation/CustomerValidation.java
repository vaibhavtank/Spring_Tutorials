package com.vishal.spring.mvc.bean.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.vishal.spring.mvc.bean.Customer;

public class CustomerValidation implements Validator{

	@Override
	public boolean supports(Class<?> clz) {
		// TODO Auto-generated method stub
		return Customer.class.equals(clz) ;
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		
		Customer customer = (Customer)object;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "valid.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "valid.address");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "valid.gender");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "degree", "valid.degree");

		int passwordLength = customer.getPassword().length();
		if(passwordLength < 6 && passwordLength >12){
			
			errors.rejectValue("password", "valid.password.range");
		}
		
		int selectedLanguages = customer.getLanguage().length;
		if(selectedLanguages <1){
			errors.rejectValue("language", "valid.language");
		}
		
	}

}
