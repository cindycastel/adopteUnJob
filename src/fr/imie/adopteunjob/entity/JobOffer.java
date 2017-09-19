package fr.imie.adopteunjob.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JobOffer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private Date startingDay;
	private int duration;
	private String contactName;
	private String contactEmail;
	private String contactPhone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="firm_fk")
	private Firm firm;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contract_fk")
	private Contract contract;
	
	public JobOffer() {	}

	public JobOffer(Long id, String name, String description, Date startingDay, int duration, String contactName,
			String contactEmail, String contactPhone, Firm firm) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startingDay = startingDay;
		this.duration = duration;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.firm = firm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getStartingDay() {
		return startingDay;
	}

	public void setStartingDay(Date startingDay) {
		this.startingDay = startingDay;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Firm getFirm() {
		return firm;
	}

	public void setFirm(Firm firm) {
		this.firm = firm;
	}
	
}
