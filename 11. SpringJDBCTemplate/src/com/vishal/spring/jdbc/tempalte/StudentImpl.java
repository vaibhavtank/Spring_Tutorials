package com.vishal.spring.jdbc.tempalte;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentImpl implements StudentDAO {

	private DataSource ds;
	private JdbcTemplate jdbcTemplate;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student (name, address, age) values (?,?,?)";

		jdbcTemplate.update(sql, new Object[]{student.getName(), student.getAddress(),
				student.getAge()});

	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "update student set name=?, address=?, age=? where  id=?";

		jdbcTemplate.update(sql, new Object[]{student.getName(), student.getAddress(),
				student.getAge(), student.getId()});

	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id=?";

		jdbcTemplate.update(sql, id);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		String sql = "select * from student";
		StudentMapper mapper = new StudentMapper();
		List<Student> students =  jdbcTemplate.query(sql, mapper);
		return students;
	}

	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id=?";
		
		Object[] requiredType = new Object[]{id};
		StudentMapper mapper = new StudentMapper();
		Student student =  jdbcTemplate.queryForObject(sql, requiredType , mapper);				
		return student;
	}
	

}
