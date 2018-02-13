package com.suchi.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Author {
	
	private String fName;
	private String lName;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
