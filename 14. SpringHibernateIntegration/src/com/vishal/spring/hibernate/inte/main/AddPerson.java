package com.vishal.spring.hibernate.inte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.hibernate.inte.Person;
import com.vishal.spring.hibernate.inte.PersonBo;

public class AddPerson {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PersonBo personBo = (PersonBo)context.getBean("personBo");
		
		Person person = new Person();
		person.setPaddress("Satellite");
		person.setPname("Vish");
		
		personBo.add(person);
		
		System.out.println("Add Person Data...");
		
	}
	
}
