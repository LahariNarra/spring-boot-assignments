package com.capgemini.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.jpa.dao.PersonDao;
import com.capgemini.spring.jpa.entity.Person;

@Repository
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	@Override
	public void addNew(Person person) {
		personDao.save(person);
	}

	@Override
	public Person findbyId(int personId) {
		Person person = personDao.findById(personId).get();
		return person;
	}

	

	
}
