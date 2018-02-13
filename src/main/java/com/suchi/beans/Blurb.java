package com.suchi.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blurb {

	@Id @GeneratedValue
	private int blurbId;
	private String title;
	private String quote;

	public int getBlurbId() {
		return blurbId;
	}

	public void setBlurbId(int blurbId) {
		this.blurbId = blurbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
}
