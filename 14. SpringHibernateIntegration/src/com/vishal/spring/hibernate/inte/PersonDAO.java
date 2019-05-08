package com.vishal.spring.hibernate.inte;

import java.util.List;

public interface PersonDAO {

	public void add(Person person);
	public void update(Person person);
	public void delete(int pid);
	public Person find(int pid);
	public List<Person> list();
	
	
}
