package com.vishal.spring.jdbc.tempalte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.tempalte.Student;
import com.vishal.spring.jdbc.tempalte.StudentImpl;

public class AddStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		Student s = new Student();
		s.setAge(23);
		s.setAddress("Satellite");
		s.setName("Vishal");
		
		template.addStudent(s);
		
		System.out.println("Data is added Successfully.....");
		
		
	}
}
