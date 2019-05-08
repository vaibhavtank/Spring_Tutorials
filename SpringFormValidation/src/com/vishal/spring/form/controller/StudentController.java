package com.vishal.spring.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vishal.spring.form.bean.Student;

@Controller
public class StudentController {

	@Autowired
	@Qualifier("studentValidation")
	private Validator validator;

	@InitBinder	
	public void setValidator(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	private String initStudentForm(Model model) {
		// TODO Auto-generated method stub

		Student student = new Student();
		model.addAttribute("student", student);
		
		return "student";
		
	}
	
	@RequestMapping(value="/student" ,method=RequestMethod.POST)
	private String submitStudentForm(Model model, @Validated Student student , BindingResult result ) {
		// TODO Auto-generated method stub

		String returnVal = "success";
		if(result.hasErrors()){
			returnVal = "student";
		}else{
			model.addAttribute("student", student);
		}
		
		return returnVal;
	}
	
	
	
}
