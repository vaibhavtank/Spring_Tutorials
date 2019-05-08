package com.vishal.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunLifeCycleMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		
		Bean bean = (Bean)context.getBean("hello");
		
		System.out.println(">>>" + bean.getMessage());
		
		context.registerShutdownHook(); // This will ensures a graceful shutdown and calls the relevant destroy methods.
	}
	
}
