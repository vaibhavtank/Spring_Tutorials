package com.vishal.spring.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.Student;
import com.vishal.spring.jdbc.StudentImpl;

public class FindStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		int id = 3;
		Student s = template.findStudent(id);
		
		System.out.println(s);
		
		
	}
}
