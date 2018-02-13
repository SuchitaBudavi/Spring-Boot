package com.suchi.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookRating {

	@Id @GeneratedValue
	private int ratingId;
	private int rating;
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}	
}
