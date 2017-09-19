package fr.imie.adopteunjob.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Candidate extends User {

	private String lastname;
	private String firstname;
	private Date birthday;
	private String linkedIn;
	private char gender;
	private String formation;
	private String cv;
	private String workExperience;
	
	@ManyToMany
	@JoinTable(name="candidate_skill")
	private List<Skill> skillList;
	
	
	public Candidate() {
		super();
	}

	public Candidate(Long id, String username, String password, String email, String numAdress, String streetAdress,
			City city, String phoneNumber, String photo, String website, String presentation, 
			String lastname, String firstname, Date birthday, String linkedIn, char gender, String formation,
			String cv, String workExperience, List<Skill> skillList) {
		super(id, username, password, email, numAdress, streetAdress, city, phoneNumber, photo, website, presentation);
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthday = birthday;
		this.linkedIn = linkedIn;
		this.gender = gender;
		this.formation = formation;
		this.cv = cv;
		this.workExperience = workExperience;
		this.skillList = skillList;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	
}
