package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	
	//If we wish to read the country values from Java
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> favoriteLanguageOptions;
	private String[] operatingSystem;
	private LinkedHashMap<String,String> operatingSystemOptions;
	

	public Student() {
		//populate the LinkedHashMap of countries at the time of creation of the bean
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("CN","Canada");
		countryOptions.put("US", "America");
		//populate the LinkedHashMap of favorite Language
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java","Java");
		favoriteLanguageOptions.put("Python","Python");
		favoriteLanguageOptions.put("CSharp","C#");
		favoriteLanguageOptions.put("DotNet","DotNet");
		//populate the operating System options
		operatingSystemOptions = new LinkedHashMap<>();
		operatingSystemOptions.put("IOS", "IOS");
		operatingSystemOptions.put("Windows", "Windows");
		operatingSystemOptions.put("Linux", "Ubuntu");
		operatingSystemOptions.put("Microsoft", "Microsoft");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		this.favoriteLanguage=favoriteLanguage;
	}
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String,String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public LinkedHashMap<String,String> getOperatingSystemOptions(){
		return operatingSystemOptions;
	}
}
