package com.vishal.spring.jdbc.tempalte;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(rs.getInt("id"));
		s.setAge(rs.getInt("age"));
		s.setName(rs.getString("name"));
		s.setAddress(rs.getString("address"));
		return s;
	}

}
