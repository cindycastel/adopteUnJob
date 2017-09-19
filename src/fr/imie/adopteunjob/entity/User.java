package fr.imie.adopteunjob.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	private String username;
	private String password;
	private String email;
	private String numAdress;
	private String streetAdress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="city_fk")
	private City city;
	
	private String phoneNumber;
	private String photo;
	private String website;
	private String presentation;
	
	public User() {}

	public User(Long id, String username, String password, String email, String numAdress, String streetAdress,
			City city, String phoneNumber, String photo, String website, String presentation) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.numAdress = numAdress;
		this.streetAdress = streetAdress;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.photo = photo;
		this.website = website;
		this.presentation = presentation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumAdress() {
		return numAdress;
	}

	public void setNumAdress(String numAdress) {
		this.numAdress = numAdress;
	}

	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	
}
