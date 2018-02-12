package com.suchi.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	private String courseId; 
	private String name;
	private String description;
	
	//many to one relation
	@ManyToOne(fetch=FetchType.LAZY)
	private Topic topic;
	
	public Course() {
		super();
	}
	public Course(String id, String name, String desc) {
		super();
		this.courseId = id;
		this.name = name;
		this.description = desc;
	}
	
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
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
