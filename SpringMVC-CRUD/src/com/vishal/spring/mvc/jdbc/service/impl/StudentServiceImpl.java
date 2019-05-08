package com.vishal.spring.mvc.jdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vishal.spring.mvc.jdbc.bean.Student;
import com.vishal.spring.mvc.jdbc.dao.StudentDAO;
import com.vishal.spring.mvc.jdbc.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO; 
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.addStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.updateStudent(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(id);
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		return studentDAO.findStudent(id);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getStudents();
	}

}
