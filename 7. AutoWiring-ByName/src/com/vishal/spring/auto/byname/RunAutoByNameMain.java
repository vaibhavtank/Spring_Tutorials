package com.vishal.spring.auto.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunAutoByNameMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		Person person = (Person) context.getBean("person");

		person.callPhone();
		
	}

}
