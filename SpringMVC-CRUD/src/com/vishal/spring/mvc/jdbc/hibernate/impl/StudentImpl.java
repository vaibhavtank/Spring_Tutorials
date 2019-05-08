package com.vishal.spring.mvc.jdbc.hibernate.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vishal.spring.mvc.jdbc.bean.Student;
import com.vishal.spring.mvc.jdbc.dao.StudentDAO;

public class StudentImpl extends HibernateDaoSupport implements StudentDAO{

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(student);
		System.out.println("Hibernate Save");
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(student);
		System.out.println("Hibernate Update");
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		HibernateTemplate template = getHibernateTemplate();
		Student student = template.get(Student.class, id);
		template.delete(student);
		System.out.println("Hibernate Delete");
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Student.class, id);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> students = getHibernateTemplate().find("from Student");
		return students;
	}

}
