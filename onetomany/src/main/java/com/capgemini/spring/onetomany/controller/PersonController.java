package com.capgemini.spring.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.onetomany.dao.PersonDao;
import com.capgemini.spring.onetomany.entity.Certificate;
import com.capgemini.spring.onetomany.entity.Person;

@RestController
public class PersonController {

	@Autowired
	PersonDao personDao;
	
	@RequestMapping("/")
	public void add() {
		Set<Certificate> set = new HashSet<Certificate>();
		Certificate certificate1 = new Certificate(301, "Java", "Issued by Oracle");
		Certificate certificate2 = new Certificate(302, "DBMS", "Issued by Oracle");
		Certificate certificate3 = new Certificate(303, "Perl", "Issued by Hadoop");
		set.add(certificate1);
		set.add(certificate2);
		set.add(certificate3);
		Person person = new Person(101, "Lahari", set);
		personDao.save(person);
	}
	
	@RequestMapping("/new")
	public Person getDetails() {
		Person person =personDao.findById(101).get();
		return person;
		
		
		
	}
}
