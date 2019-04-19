package com.capgemini.spring.onetoone.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.onetoone.person.entity.Person;

@RestController
public interface PersonDao extends JpaRepository<Person, Integer>  {

}
