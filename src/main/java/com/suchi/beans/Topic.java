package com.suchi.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String topicId; 
	private String name;
	private String description;
	
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
}
