package com.vishal.spring.staticpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	private String index() {
		// TODO Auto-generated method stub
		
		return "index";
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	private String contact() {
		// TODO Auto-generated method stub
		System.out.println("Contact Us Page");
		return "redirect:/pages/contact.html";
	}
	
}
