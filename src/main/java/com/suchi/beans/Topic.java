package com.suchi.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Topic {
	
	@Id
	private String topicId; 
	private String name;
	private String description;
	
	//@OneToMany(fetch=FetchType.LAZY,mappedBy="topic")
	//@JoinTable(name="TOPIC_BOOK",joinColumns=@JoinColumn(name="TOPIC_ID"),inverseJoinColumns=@JoinColumn(name="BOOK_ID"))
	//private List<Book> books;
	
	public Topic() {
		super();
	}
	public Topic(String id, String name, String desc) {
		super();
		this.topicId = id;
		this.name = name;
		this.description = desc;
	}
	
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desc) {
		this.description = desc;
	}
	/*public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}*/
	
}
