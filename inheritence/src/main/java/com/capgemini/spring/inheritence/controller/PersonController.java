package com.capgemini.spring.inheritence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.inheritence.Service.PersonService;
import com.capgemini.spring.inheritence.entity.Person;
import com.capgemini.spring.inheritence.entity.PersonInfo;

@RestController
public class PersonController {

		@Autowired
		PersonService personService;
		
		@RequestMapping("/")
		public Person setDetails() {
			Person person = new PersonInfo(101, "Lahari", 20000, 1500);
			personService.addNew(person);
			return person;
		}
}
