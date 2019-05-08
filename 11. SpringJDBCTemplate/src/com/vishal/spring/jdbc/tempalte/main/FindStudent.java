package com.vishal.spring.jdbc.tempalte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.tempalte.Student;
import com.vishal.spring.jdbc.tempalte.StudentImpl;

public class FindStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		int id = 1;
		Student s = template.findStudent(id);
		
		System.out.println(s);
		
		
	}
}
