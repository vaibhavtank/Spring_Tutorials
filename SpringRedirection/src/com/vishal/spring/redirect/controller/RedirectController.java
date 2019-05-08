package com.vishal.spring.redirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String index() {
		// TODO Auto-generated method stub
		System.out.println("Index Page Call");
		return "index";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	private String redirect() {
		// TODO Auto-generated method stub
		System.out.println("Redirecting to Final Page");
		return "redirect:finalCall";
	}

	@RequestMapping(value = "/finalCall", method = RequestMethod.GET)
	private String finalCall() {
		// TODO Auto-generated method stub
		System.out.println("Final Page Call");
		return "final";
	}

}
