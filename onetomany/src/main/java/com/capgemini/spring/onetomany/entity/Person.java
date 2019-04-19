package com.capgemini.spring.onetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	private int personId;
	private String personName;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval= true)
	private Set<Certificate> certifications;

	public Person() {
		super();
	}

	

	public Person(int personId, String personName, Set<Certificate> certifications) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certifications = certifications;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	
	public Set<Certificate> getCertifications() {
		return certifications;
	}

	public void setCertifications(Set<Certificate> certifications) {
		this.certifications = certifications;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certifications=" + certifications
				+ "]";
	}

}
