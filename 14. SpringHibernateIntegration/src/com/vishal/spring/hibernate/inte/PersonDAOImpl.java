package com.vishal.spring.hibernate.inte;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDAOImpl extends HibernateDaoSupport implements PersonDAO{

	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(person);
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(person);
	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		HibernateTemplate template =  getHibernateTemplate();
		Person person =  (Person)template.get(Person.class, pid);
		template.delete(person);
	}

	@Override
	public Person find(int pid) {
		// TODO Auto-generated method stub
		Person person = (Person)getHibernateTemplate().get(Person.class, pid);
		return person;
	}

	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		
		List<Person> persons = getHibernateTemplate().find("from Person");
		
		return persons;
	}

}
