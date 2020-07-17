 package com.vaibhav.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApplicationContextMain {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		
		//ApplicationContext context = new FileSystemXmlApplicationContext
		//            ("D:/Vishal/Workspace/Spring/HelloWorld/src/Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("hello");
		
		System.out.println(">>> " + obj.getMessage());
	}
	
}
