package com.vishal.spring.jdbc.tempalte.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.spring.jdbc.tempalte.Student;
import com.vishal.spring.jdbc.tempalte.StudentImpl;

public class ListStudent {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentImpl template =  (StudentImpl) context.getBean("student");
		
		List<Student> students = template.getStudents();
		
		for(Student s : students){
			System.out.println(s);
		}
		
	}
}
