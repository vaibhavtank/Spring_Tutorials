package com.vishal.spring.jdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.Student;
import com.vishal.spring.jdbc.StudentImpl;

public class ListStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		List<Student> students = template.getStudents();
		
		for(Student s : students){
			System.out.println(s);
		}
		
	}
}
