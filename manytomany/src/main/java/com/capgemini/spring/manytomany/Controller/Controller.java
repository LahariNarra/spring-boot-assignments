package com.capgemini.spring.manytomany.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.manytomany.entity.Person;
import com.capgemini.spring.manytomany.entity.Project;
import com.capgemini.spring.manytomany.service.PersonService;

@RestController
public class Controller {

	@Autowired
	PersonService service;

	@RequestMapping("/")
	public Set<Person> add() {
		Set<Project> project = new HashSet<Project>();
		project.add(new Project(501, "JEE Cloud", "Mumbai", "Abc"));
		project.add(new Project(502, "JEE Stack", "Mumbai", "PQR"));
		project.add(new Project(503, "Sap", "Hyderabad", "XYZ"));
		Set<Person> person = new HashSet<Person>();
		person.add(new Person(101, "lahari", project));
		person.add(new Person(102, "Mukhesh", project));
		person.add(new Person(103, "Nandini", project));
		person.add(new Person(104, "Karthik", project));

		service.addNew(person);
		return person;

	}

}
