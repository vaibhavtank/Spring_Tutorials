package com.vishal.spring.hibernate.inte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.hibernate.inte.Person;
import com.vishal.spring.hibernate.inte.PersonBo;

public class UpdatePerson {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PersonBo personBo = (PersonBo)context.getBean("personBo");
		
		Person person = new Person();
		person.setPaddress("CGRoad");
		person.setPname("VKS");
		person.setPid(2);
		personBo.update(person);
		
		System.out.println("Update Person Data...");
		
	}
	
}
