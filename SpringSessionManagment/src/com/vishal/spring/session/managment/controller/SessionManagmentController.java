package com.vishal.spring.session.managment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.vishal.spring.session.managment.bean.Login;
import com.vishal.spring.session.managment.bean.validator.LoginValidator;

@Controller
@SessionAttributes("login")
public class SessionManagmentController {

	LoginValidator loginValidator;

	public LoginValidator getLoginValidator() {
		return loginValidator;
	}

	@Autowired
	public void setLoginValidator(LoginValidator loginValidator) {
		this.loginValidator = loginValidator;
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	private ModelAndView index() {
		// TODO Auto-generated method stub

		ModelAndView model = new ModelAndView("index", "login", new Login());

		return model;
	}
	
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	private ModelAndView auth() {
		// TODO Auto-generated method stub

		ModelAndView model = new ModelAndView("index", "login", new Login());
		model.addObject("error", "You are Fake User. Session is destoryed!!! If you not then please go through Login Phase.");
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	private String login(@ModelAttribute Login login, Model model,
			BindingResult result) {
		// TODO Auto-generated method stub

		loginValidator.validate(login, result);
		
		if (result.hasErrors()) {

			return "index";
		} else {
			model.addAttribute("login", login);

			return "success";
		}
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	private String profile() {
		// TODO Auto-generated method stub

		return "profile";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	private String logout(HttpSession session){
		
		System.out.println("Logout");
		// This is another techniques for session management.... back tracking is also perfect after expiring the session.
		session.removeAttribute("login");
		session.invalidate();
		
		return "redirect:/";
	}
	
	/*
	 * If we are doing this techniques then session will not destroy after writing the session.invalidate() - spring security will destroy.
	 * Must be redirect from the controller.
	 * 
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	private String logout(HttpSession session, Model model){
		
		System.out.println("Logout");
		// This is another techniques for session management.... back tracking is also perfect after expiring the session.
		String name = ((Login)session.getAttribute("login")).getName();
		session.removeAttribute("login");
		session.invalidate();
		
		model.addAttribute("logout", name +" logout Successfully!!!!");
		
		return "index";
	}*/
	
	@ExceptionHandler(Exception.class)
	private String handleException(Model model, Exception e) {
		// TODO Auto-generated method stub

		model.addAttribute("exception", e);
		return "error";
	}
	//Now Exception Problem is solved.....
}
