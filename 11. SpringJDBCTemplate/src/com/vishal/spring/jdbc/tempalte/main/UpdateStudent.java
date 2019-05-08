package com.vishal.spring.jdbc.tempalte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.tempalte.Student;
import com.vishal.spring.jdbc.tempalte.StudentImpl;

public class UpdateStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		Student s = new Student();
		s.setAge(24);
		s.setAddress("Satellite");
		s.setName("Vishal");
		s.setId(1);
		template.updateStudent(s);
		
		System.out.println("Data is updated Successfully.....");
		
		
	}
}
