package com.capgemini.spring.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {
	
	@Id
	private int id;
	private String name;
	private String description;

	@ManyToOne
	@JoinColumn(name = "personId")
	private Person person;

	public Certificate() {
		super();
	}

	public Certificate(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	/*
	 * public Person getPerson() { return person; }
	 * 
	 * public void setPerson(Person person) { this.person = person; }
	 */

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", description=" + description + ", person=" + person + "]";
	}

	

}
