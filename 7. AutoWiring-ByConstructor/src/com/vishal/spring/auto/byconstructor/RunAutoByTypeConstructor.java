package com.vishal.spring.auto.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunAutoByTypeConstructor {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		Person person = (Person) context.getBean("person");

		person.callPhone();
		
	}

}
