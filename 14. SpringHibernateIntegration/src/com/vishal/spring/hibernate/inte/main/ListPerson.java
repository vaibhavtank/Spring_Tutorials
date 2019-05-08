package com.vishal.spring.hibernate.inte.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.hibernate.inte.Person;
import com.vishal.spring.hibernate.inte.PersonBo;

public class ListPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		PersonBo personBo = (PersonBo) context.getBean("personBo");
		List<Person> persons = personBo.list();
		for (Person person : persons)
			System.out.println("id : " + person.getPid() + " name : "
					+ person.getPname() + " address : " + person.getPaddress());
	}

}
