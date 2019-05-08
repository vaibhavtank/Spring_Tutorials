package com.vishal.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSingletonScopeMain {

	public static void main(String[] args) {
		
		//This scopes the bean definition to a single instance per Spring IoC container (default).
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Bean bean = (Bean)context.getBean("hello");
		
		bean.setMessage("A");
		System.out.println("Bean Instatnce 1>>>" + bean.getMessage());
		
		Bean bean1 = (Bean)context.getBean("hello");
		//bean1.setMessage("A");
		System.out.println("Bean Instatnce 2>>>" + bean1.getMessage());
		
	}
	
}
