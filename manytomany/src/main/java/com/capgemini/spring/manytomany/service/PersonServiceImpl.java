package com.capgemini.spring.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.manytomany.dao.PersonDao;
import com.capgemini.spring.manytomany.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;

	@Override
	public Set<Person> addNew(Set<Person> person) {
		dao.saveAll(person);
		return person;
	}

}
