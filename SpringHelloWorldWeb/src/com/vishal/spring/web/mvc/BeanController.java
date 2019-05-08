package com.vishal.spring.web.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeanController {

	/**
	 * The import org.springframework.stereotype.Controller conflicts with a
	 * type defined in the same file This error means your class name is simplar
	 * to annotation name... Spo you have to modifiy the controller of class
	 * name...
	 * 
	 * You have to tack jar file of the given lib folders...
	 * 
	 * Now error is resolved....
	 */

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String control(ModelMap model) {
		// TODO Auto-generated method stub

		System.out.println("Control Method Call");

		model.addAttribute("message", "Hello World!!!");

		return "hello";

	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	private String welcome(ModelMap model) {
		// TODO Auto-generated method stub

		System.out.println("Welcome Page Call");

		model.addAttribute("welcome", "Welcome to the Spring MVC");

		return "welcome";
	}

	@RequestMapping(value = "/formCall", method = RequestMethod.POST)
	private ModelAndView callForm(HttpServletRequest request,
			HttpServletResponse response) {

		String name = request.getParameter("name");
		String address = request.getParameter("address");

		System.out.println("Form Page Call");
		System.out.println("Name : " + name + " Address : " + address);

		ModelAndView model = new ModelAndView("show", "name", name);

		return model;
	}

	@RequestMapping(value = "/passParam", method = RequestMethod.POST)
	private String getMultiParam(HttpServletRequest request, HttpServletResponse response ,ModelMap model) {
		// TODO Auto-generated method stub

		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		System.out.println("Multiple Paramters : Name : " + name + " Address : "+ address);
		
		model.addAttribute("name", name);
		model.addAttribute("address", address);
		
		return "show";
	}

}
