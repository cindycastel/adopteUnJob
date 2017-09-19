package fr.imie.adopteunjob.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCity;
	private String zipCode;
	private String cityName;
	
	public City() {	}
		
	public City(Long idCity, String zipCode, String cityName) {
		this.idCity = idCity;
		this.zipCode = zipCode;
		this.cityName = cityName;
	}


	public Long getIdCity() {
		return idCity;
	}
	
	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
}
