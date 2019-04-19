package com.capgemini.spring.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.onetoone.person.dao.PersonDao;
import com.capgemini.spring.onetoone.person.entity.Person;
import com.capgemini.spring.onetoone.profile.entity.Profile;

@RestController
public class Controller {

	@Autowired
	PersonDao personDao;
	
	@RequestMapping("/")
	public void add() {
		Person person = new Person(100, "Lahari",new Profile(200,"Java","Knows Core and advanced"));
		personDao.save(person);
	}
	
	@RequestMapping("/new")
	public Person findById() {
		Person person = personDao.findById(100).get();
		return person;
	}
}
