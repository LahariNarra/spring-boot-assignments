package com.capgemini.spring.manytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.capgemini.spring.manytomany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer> {

}
