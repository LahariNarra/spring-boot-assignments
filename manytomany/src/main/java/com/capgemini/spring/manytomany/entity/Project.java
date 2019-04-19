package com.capgemini.spring.manytomany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

	@Id
	@Column(name="project")
	private int projectId;
	private String projectName;
	private String projectLocation;
	private String projectManager;
	
	@ManyToMany
	private Set<Person> person;

	public Project() {
		super();
	}

	public Project(int projectId, String projectName, String projectLocation, String projectManager) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLocation = projectLocation;
		this.projectManager = projectManager;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	//public Set<Person> getPerson() {
		//return person;
	//}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectLocation="
				+ projectLocation + ", projectManager=" + projectManager + ", person=" + person + "]";
	}
	
	
	
	
}
