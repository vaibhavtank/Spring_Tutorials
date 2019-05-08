package com.vishal.spring.hibernate.inte;

import java.util.List;

public class PersonBoImpl implements PersonBo {

	private PersonDAO personDAO;

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		this.personDAO.add(person);
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		this.personDAO.update(person);
	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		this.personDAO.delete(pid);
	}

	@Override
	public Person find(int pid) {
		// TODO Auto-generated method stub
		
		return this.personDAO.find(pid);
	}

	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		return this.personDAO.list();
	}

}
