package com.vishal.spring.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunConstructorDIMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Customer customer = (Customer)context.getBean("customer");
		
		//System.out.println(customer);
		System.out.println("List : " + customer.getLists());
		System.out.println("Set : " + customer.getSets());
		System.out.println("Map : " + customer.getMaps());
		System.out.println("Props : " + customer.getPros());
	}
	
}
