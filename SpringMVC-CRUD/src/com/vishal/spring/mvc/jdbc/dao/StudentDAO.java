package com.vishal.spring.mvc.jdbc.dao;

import java.util.List;

import com.vishal.spring.mvc.jdbc.bean.Student;

public interface StudentDAO {

	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public Student findStudent(int id);
	public List<Student> getStudents();
	
}
