package com.vishal.spring.hibernate.inte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.hibernate.inte.PersonBo;

public class DeletePerson {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PersonBo personBo = (PersonBo)context.getBean("personBo");
		
		personBo.delete(3);
		
		System.out.println("Delete Person Data...");
		
	}
	
}
