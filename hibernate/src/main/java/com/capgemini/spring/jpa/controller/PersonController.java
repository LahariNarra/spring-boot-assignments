package com.capgemini.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.jpa.entity.Person;
import com.capgemini.spring.jpa.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/")
	public void setPerson() {
		Person person = new Person(100, "lahari");
		personService.addNew(person);
	}
	
	@RequestMapping("/get")
	public Person getPerson() {
		Person person = personService.findbyId(100);
		return person;
	}
	

}
