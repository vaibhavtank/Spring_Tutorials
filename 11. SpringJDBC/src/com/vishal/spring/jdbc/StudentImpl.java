package com.vishal.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class StudentImpl implements StudentDAO {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student (name, address, age) values (?,?,?)";

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setString(2, student.getAddress());
			ps.setInt(3, student.getAge());

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "update student set name=?, address=?, age=? where id=?";

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getName());
			ps.setString(2, student.getAddress());
			ps.setInt(3, student.getAge());
			ps.setInt(4, student.getId());

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id=?";

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		String sql = "select * from student";
		List<Student> students = new ArrayList<Student>();

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setAge(rs.getInt("age"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				
				students.add(s);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return students;
	}

	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id=?";
		Student s = new Student();
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				s.setId(rs.getInt("id"));
				s.setAge(rs.getInt("age"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s;
	}

}
