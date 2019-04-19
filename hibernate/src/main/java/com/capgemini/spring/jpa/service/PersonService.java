package com.capgemini.spring.jpa.service;

import org.springframework.stereotype.Repository;

import com.capgemini.spring.jpa.entity.Person;

@Repository
public interface PersonService {

	public void addNew(Person person);
	public Person findbyId(int personId);
}
