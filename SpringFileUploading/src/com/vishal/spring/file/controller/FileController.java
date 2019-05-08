package com.vishal.spring.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.vishal.spring.file.bean.Form;
import com.vishal.spring.file.bean.validator.FormValidator;

@Controller
public class FileController {

	@Autowired
	@Qualifier("formValidator")
	Validator validator;
	
	
	//THis is the solution of the wrong validation illegal exceptions.
	
	@InitBinder(value="file")
	private void initBinder(WebDataBinder binder) {
		// TODO Auto-generated method stub
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/file", method=RequestMethod.GET)
	private String getForm(Model model) {
		// TODO Auto-generated method stub
		
		Form form = new Form();
		model.addAttribute("form", form);
		
		return "file";
		
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	private String fileUpload(Model model, @Validated Form form, BindingResult result) {
		// TODO Auto-generated method stub
		String returnVal ="success";
		System.out.println("fileUpload");
		if(result.hasErrors()){
			returnVal="file";
		}else{
			MultipartFile multipartFile = form.getFile();
			System.out.println("Content Type of File" +multipartFile.getContentType());
			System.out.println("File Name" +multipartFile.getName());
			System.out.println("Original File Name" +multipartFile.getOriginalFilename());
			model.addAttribute("fileData", multipartFile);
			model.addAttribute("fileName", multipartFile.getName());
			model.addAttribute("fileOName", multipartFile.getOriginalFilename());
			
		}
		
		return returnVal;
		
	}
	
}
