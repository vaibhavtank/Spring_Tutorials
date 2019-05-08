package com.vishal.spring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunBeanInheritanceMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	
		Customer customer =  (Customer)context.getBean("countryBean");
		System.out.println(customer);
	}
	
}
