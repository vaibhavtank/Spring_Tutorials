package com.vishal.spring.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.StudentImpl;

public class DeleteStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		int id=3;
		
		template.deleteStudent(id);
		
		System.out.println("Data is deleted Successfully.....");
		
		
	}
}
