package com.vishal.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InternateCafe {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Customer customer = (Customer)context.getBean("customerProxy");
		
		customer.browser();
	}
	
}
