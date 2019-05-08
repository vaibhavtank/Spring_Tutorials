package com.vishal.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunPrototypeScopeMain {
	public static void main(String[] args) {

		//Spring IoC container creates new bean instance of the object every time a request for that specific bean is made.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Bean bean = (Bean)context.getBean("helloproto");
		
		bean.setMessage("Tops Technologies");
		System.out.println(">>>" + bean.getMessage());
		
		Bean bean1 = (Bean)context.getBean("helloproto");
		System.out.println(">>>" + bean1.getMessage());
		
	}

}
