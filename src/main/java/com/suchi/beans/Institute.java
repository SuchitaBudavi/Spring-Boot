package com.suchi.beans;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "institute")
public class Institute {

	@Id
	int id;
	String name;
	String city;
	String university;
	
	
	
	public Institute() {
		super();
	}
	public Institute( String name, String city, String university) {
		super();		
		this.name = name;
		this.city = city;
		this.university = university;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
}
