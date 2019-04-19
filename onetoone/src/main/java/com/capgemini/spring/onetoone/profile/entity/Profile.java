package com.capgemini.spring.onetoone.profile.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.capgemini.spring.onetoone.person.entity.Person;

@Entity
public class Profile {

	@Id
	private int profileId;
	private String profileName;
	private String profileDescription;

	@OneToOne(mappedBy = "profile")
	private Person person;

	public Profile() {
		super();
	}

	public Profile(int profileId, String profileName, String profileDescription) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.profileDescription = profileDescription;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getProfileDescription() {
		return profileDescription;
	}

	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}

	

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profileName=" + profileName + ", profileDescription="
				+ profileDescription + ", person=" + person + "]";
	}

}
