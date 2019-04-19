package com.capgemini.spring.inheritence.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.inheritence.Dao.PersonDao;
import com.capgemini.spring.inheritence.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Override
	public Person addNew(Person person) {
		personDao.save(person);
		return person;
	}

}
