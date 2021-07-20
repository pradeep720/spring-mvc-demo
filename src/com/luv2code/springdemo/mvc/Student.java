package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Student {
	
	private String firstName;
	private String secondName;
	private String country;
	private LinkedHashMap<String, String> countryOptions ;
	private String favoriteLanguage ;
	private String[] operatingSystems;
	
	
	
	public Student() {
	
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("pk", "pakistan");
		countryOptions.put("ST", "Srilanka");
		countryOptions.put("BD", "Bangaldesh");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	

	
}
