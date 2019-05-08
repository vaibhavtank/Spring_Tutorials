package com.vishal.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

	public void setDataSource(DataSource ds);
	
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> getStudents();
	public Student findStudent(int id);
	
}
