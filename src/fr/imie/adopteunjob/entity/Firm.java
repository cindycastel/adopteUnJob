package fr.imie.adopteunjob.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Firm extends User {

	private String companyName;
	private String activitySector;
	private String nafCode;
	
	@OneToMany(mappedBy="firm")
	private List<JobOffer> jobOfferList;
	
	public Firm() {
		super();
	}
	
	public Firm(Long id, String username, String password, String email, String numAdress, String streetAdress,
			City city, String phoneNumber, String photo, String website, String presentation, String companyName, String activitySector, String nafCode, List<JobOffer> jobOfferList) {
		super(id, username, password, email, numAdress, streetAdress, city, phoneNumber, photo, website, presentation);
		this.companyName = companyName;
		this.activitySector = activitySector;
		this.nafCode = nafCode;
		this.jobOfferList = jobOfferList;
	}

	public List<JobOffer> getJobOfferList() {
		return jobOfferList;
	}

	public void setJobOfferList(List<JobOffer> jobOfferList) {
		this.jobOfferList = jobOfferList;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getActivitySector() {
		return activitySector;
	}

	public void setActivitySector(String activitySector) {
		this.activitySector = activitySector;
	}

	public String getNafCode() {
		return nafCode;
	}

	public void setNafCode(String nafCode) {
		this.nafCode = nafCode;
	}
	
}
