package com.suchi.beans;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id @GeneratedValue
	private int bookId;
	private String title;	
	@OneToOne
	private BookRating rating;
	@ElementCollection
	private List<Blurb> blurbs;
	@Embedded
	private Author author;
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
	public BookRating getRating() {
		return rating;
	}
	public void setRating(BookRating rating) {
		this.rating = rating;
	}
	public List<Blurb> getBlurbs() {
		return blurbs;
	}
	public void setBlurbs(List<Blurb> blurbs) {
		this.blurbs = blurbs;
	}
}
