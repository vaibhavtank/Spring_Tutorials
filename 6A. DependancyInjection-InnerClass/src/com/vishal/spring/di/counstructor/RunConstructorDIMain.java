package com.vishal.spring.di.counstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunConstructorDIMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Person person = (Person)context.getBean("person");
		
		person.callPhone();
		
	}
	
}
