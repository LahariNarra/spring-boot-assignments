package com.capgemini.spring.manytomany.service;

import java.util.Set;

import com.capgemini.spring.manytomany.entity.Person;

public interface PersonService {
	public Set<Person> addNew(Set<Person> person);

}
