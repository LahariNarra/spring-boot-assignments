package com.capgemini.spring.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.spring.onetomany.entity.Person;

@RestController
public interface PersonDao extends JpaRepository<Person, Integer>{

}
