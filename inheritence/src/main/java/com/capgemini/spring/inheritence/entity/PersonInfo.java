package com.capgemini.spring.inheritence.entity;

import javax.persistence.Entity;

@Entity
public class PersonInfo extends Person {

	private float salary;
	private float bonus;

	public PersonInfo() {
		super();
	}

	public PersonInfo(int personId, String personName,float salary, float bonus) {
		super(personId, personName);
		this.salary = salary;
		this.bonus = bonus;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "PersonInfo [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
