package com.vishal.spring.hibernate.inte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.hibernate.inte.Person;
import com.vishal.spring.hibernate.inte.PersonBo;

public class FindPerson {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PersonBo personBo = (PersonBo)context.getBean("personBo");
		
		
		Person person = personBo.find(1);
		
		System.out.println("id : " +  person.getPid() + " name : " + person.getPname() + " address : " + person.getPaddress());
	}
	
}
