package com.packsendme.microservice.country.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Country")

public class CountryModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codcountry;
	private String namecountry;
	private String nameimagecountry;
	private String formatnumbercountry;
	
	public CountryModel() {
		super();
	}
	
	
	public CountryModel(String codcountry, String namecountry, String nameimagecountry, String formatnumbercountry) {
		super();
		this.codcountry = codcountry;
		this.namecountry = namecountry;
		this.nameimagecountry = nameimagecountry;
		this.formatnumbercountry = formatnumbercountry;
	}
	
	
	public String getCodcountry() {
		return codcountry;
	}
	public void setCodcountry(String codcountry) {
		this.codcountry = codcountry;
	}
	public String getNamecountry() {
		return namecountry;
	}
	public void setNamecountry(String namecountry) {
		this.namecountry = namecountry;
	}
	public String getNameimagecountry() {
		return nameimagecountry;
	}
	public void setNameimagecountry(String nameimagecountry) {
		this.nameimagecountry = nameimagecountry;
	}
	public String getFormatnumbercountry() {
		return formatnumbercountry;
	}
	public void setFormatnumbercountry(String formatnumbercountry) {
		this.formatnumbercountry = formatnumbercountry;
	}
	
	

 
	
	

}
