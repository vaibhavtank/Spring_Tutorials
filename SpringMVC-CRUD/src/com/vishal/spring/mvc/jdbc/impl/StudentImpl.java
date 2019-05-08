package com.vishal.spring.mvc.jdbc.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vishal.spring.mvc.jdbc.bean.Student;
import com.vishal.spring.mvc.jdbc.dao.StudentDAO;
import com.vishal.spring.mvc.jdbc.impl.mapper.StudentMapper;

public class StudentImpl implements StudentDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "insert into student(name, address) values(?,?)";

		Object[] paramterValues = new Object[] { student.getName(),
				student.getAddress() };

		jdbcTemplate.update(sql, paramterValues);
		

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "update student set name=?, address=? where id=?";

		Object[] paramterValues = new Object[] { student.getName(),
				student.getAddress(), student.getId() };

		jdbcTemplate.update(sql, paramterValues);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "delete from student where id=?";

		Object[] paramterValues = new Object[] { id };

		jdbcTemplate.update(sql, paramterValues);
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "select * from student where id=?";
		
		Object[] parameterValues = new Object[]{id};
		
		Student student = jdbcTemplate.queryForObject(sql, parameterValues, new StudentMapper());
		
		return student;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "select * from student";
		List<Student> students =  jdbcTemplate.query(sql , new StudentMapper());
		
		return students;
	}

}
