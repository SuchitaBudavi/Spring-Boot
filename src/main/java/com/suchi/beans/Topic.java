package com.suchi.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Topic {

	private String id;	
	private String name;
	private String desc;	
	private Set<String> genere;
	
	public Topic() {
		super();
	}
	public Topic(String id, String name, String desc,Set<String> genere) {
		super();
		this.id = id;
		this.desc = desc;
		this.name = name;
		//this.genere = genere;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getGenere() {
		return genere;
	}
	public void setGenere(Set<String> genere) {
		this.genere = genere;
	}	
	
}
