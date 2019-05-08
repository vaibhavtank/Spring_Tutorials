package com.vishal.spring.mvc.jdbc.impl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vishal.spring.mvc.jdbc.bean.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowCount) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAddress(rs.getString("address"));
		
		return student;
	}

	

}
