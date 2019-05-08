package com.vishal.spring.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.vishal.spring.mvc.bean.Customer;
import com.vishal.spring.mvc.bean.validation.CustomerValidation;

@Controller
public class CustomerController {
	
	
	private CustomerValidation customerValidation;
	
	public CustomerValidation getCustomerValidation() {
		return customerValidation;
	}

	@Autowired
	public void setCustomerValidation(CustomerValidation customerValidation) {
		this.customerValidation = customerValidation;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	private ModelAndView customer() {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.setId(1);
		
		ModelAndView model = new ModelAndView("customer", "customer", customer);
		
		return model;
		
	}
	
	@ModelAttribute("customerDynamic")
	private Map<String, List<String>> dynamic(){
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Testing");
		languages.add("Asp.Net");
		languages.add("PHP");
		languages.add("Liferay");
		languages.add("Android");
		languages.add("I-Phone");
		
		map.put("languages", languages);
		
		List<String> educations = new ArrayList<String>();
		educations.add(" ");
		educations.add("BE");
		educations.add("ME");
		educations.add("MCA");
		educations.add("BCA");
		educations.add("Phd");
		
		map.put("degrees", educations);
		
		return map;
	}
	
	
	
	/*@ModelAttribute("languages")
	private List<String> dynamicTechnologies(){
		
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Testing");
		languages.add("Asp.Net");
		languages.add("PHP");
		languages.add("Liferay");
		
		
		return languages;
	}*/
	
	/*@ModelAttribute("degrees")
	private List<String> dynamicEducations(){
		
		List<String> educations = new ArrayList<String>();
		educations.add("--Select--");
		educations.add("BE");
		educations.add("ME");
		educations.add("MCA");
		educations.add("BCA");
		educations.add("Phd");
		
		return educations;
		
	}*/

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	private String addCustomer(@ModelAttribute("customer") @Validated Customer customer, ModelMap model, BindingResult result, SessionStatus status) {
		// TODO Auto-generated method stub

		/*model.addAttribute("name", customer.getName());
		model.addAttribute("address", customer.getAddress());
		model.addAttribute("language", customer.getLanguage());
		model.addAttribute("gender", customer.getGender());
		model.addAttribute("language", customer.getLanguage());
		model.addAttribute("degree", customer.getDegree());
		model.addAttribute("password", customer.getPassword());*/
		
		String returnVal = "show";
		
		customerValidation.validate(customer, result);
		
		if(result.hasFieldErrors()){
			
			returnVal = "customer";
			
		}else{
			
			status.setComplete();
			model.addAttribute("customer",customer);
		}
		
		return returnVal;
	}

}
