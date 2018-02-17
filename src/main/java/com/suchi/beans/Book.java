package com.suchi.beans;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Book {

	@Id @GeneratedValue
	private int bookId;
	private String title;	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="RATING_ID")
	private BookRating rating;
	@ElementCollection
	private List<Blurb> blurbs;
	@Embedded
	private Author author;
	@ManyToOne
	@JoinColumn(name="TOPIC_ID")
	private Topic topic;
	
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
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
